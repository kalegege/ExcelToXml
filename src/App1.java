import model.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kale on 2017/9/20.
 */
public class App1 extends JFrame implements ActionListener {

    private JPanel jPanel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JButton jButton1;
    private JButton jButton2;

    public App1(){
        init();
    }

    public void init(){
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,400);
        jPanel= new JPanel();
        jPanel.setSize(400,400);
        jPanel.setLayout(new BorderLayout(5, 5));
        jPanel.setBackground(Color.white);
        jPanel.setLayout(new FlowLayout(1,5,5));
        //panel.setLocation(0, 100);
        jLabel1=new JLabel("Excel转换XML小工具");
        jLabel1.setSize(100,20);
        jLabel2=new JLabel("...");
        jLabel2.setSize(100,20);
        jButton1=new JButton("请选择文件");
        jButton1.addActionListener(this);
        jButton2=new JButton("转换");
        jButton2.addActionListener(this);
        jPanel.add(jLabel2);
        jPanel.add(jButton1);
        this.add(jLabel1,BorderLayout.NORTH);
        this.add(jButton2,BorderLayout.SOUTH);
        this.add(jPanel,BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new App1();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        if("请选择文件".equals(cmd)){
            select();
        }

        if("转换".equals(cmd)){
            convert();
        }
    }

    private void select(){
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jfc);
        File file= jfc.getSelectedFile();
        if(file != null) {
            jLabel2.setText(file.getAbsolutePath());
        }
    }

    private void convert(){
//        String path = "/Users/kale/test/qiusuo1.xls";
        String path=jLabel2.getText();
        if(path.endsWith(".xls")){
            writeXml1(path);
        }else{
            jLabel2.setText("文件选择错误");
        }

    }

    /**
     * 从excel获取list，并输出xml
     * @param path
     */
    public void writeXml1(String path) {
        List<Policy> list = readXml(path);

        Document document = DocumentHelper.createDocument();
        Element adi=document.addElement("ADI")
                .addAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
        Element Objects=adi.addElement("Objects");
        Element object=Objects.addElement("Object")
                .addAttribute("ElementType","Program")
                .addAttribute("Action", "REGIST");
        Element type=object.addElement("Property")
                .addAttribute("Name","Type");
        type.setText("4");

//        document.setText("<ADI xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");
        Element mappings = adi.addElement("Mappings");
        for (int i = 0; i < list.size(); i++) {
            Element employee = mappings.addElement("Mapping")
                    .addAttribute("ElementType", "Program")
                    .addAttribute("Action", "REGIST");
            Element startTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidStart");
            startTime.setText(list.get(i).getStartTime());
            Element stopTime = employee.addElement("Property")
                    .addAttribute("Name", "ValidEnd");
            stopTime.setText(list.get(i).getStopTime());
        }

        try {
            OutputFormat format = new OutputFormat();
            format.setIndent(true);
            format.setNewlines(true);
            Writer fileWriter = new FileWriter("/Users/kale/test/test1.xml");
            XMLWriter xmlWriter = new XMLWriter(fileWriter, format);
            xmlWriter.write(document);
            xmlWriter.close();
            jLabel2.setText("转换成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            jLabel2.setText("error");
        }
    }

    public static List<Policy> readXml(String fileName) {
        boolean isE2007 = false;    //判断是否是excel2007格式
        List<Policy> list = new ArrayList<Policy>();
        List<BaseObject> items=new ArrayList<>();

        if (fileName.endsWith("xlsx"))
            isE2007 = true;
        try {
            InputStream input = new FileInputStream(fileName);  //建立输入流
            Workbook wb = null;
            //根据文件格式(2003或者2007)来初始化
            if (isE2007)
                wb = new XSSFWorkbook(input);
            else
                wb = new HSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(0);     //获得第一个表单
            int coloumNum = sheet.getRow(0).getPhysicalNumberOfCells();//获得总列数
            int rowNum = sheet.getLastRowNum();//获得总行数
            for (int i = 1; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                String fileName1 = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : "";
                if (i == 40) {
                    System.out.println("ddd");
                }
                if (!fileName1.equals("")) {
                    list.add(new Policy(row.getCell(10).getStringCellValue(), row.getCell(11).getStringCellValue()));
                }
            }
            System.out.println("dddd");
            return list;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static ADI readXml1(String fileName) {
        boolean isE2007 = false;    //判断是否是excel2007格式
        ADI result=new ADI();
        List<BaseObject> baseObjectList=new ArrayList<>();
        List<Mapping> mappings=new ArrayList<>();

        if (fileName.endsWith("xlsx"))
            isE2007 = true;
        try {
            InputStream input = new FileInputStream(fileName);  //建立输入流
            Workbook wb = null;
            //根据文件格式(2003或者2007)来初始化
            if (isE2007)
                wb = new XSSFWorkbook(input);
            else
                wb = new HSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(0);     //获得第一个表单
            int coloumNum = sheet.getRow(0).getPhysicalNumberOfCells();//获得总列数
            int rowNum = sheet.getLastRowNum();//获得总行数
            for (int i = 1; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                String fileName1 = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : "";
                if (i == 40) {
                    System.out.println("ddd");
                }
                if (!fileName1.equals("")) {
                    baseObjectList.add(new Program("2001","2001","REGIST",fileName1,"Series","1"));
//                    list.add(new Policy(row.getCell(10).getStringCellValue(), row.getCell(11).getStringCellValue()));
                }
            }
            result.setBaseObjectList(baseObjectList);
            result.setMappingList(mappings);
            System.out.println("dddd");
            return result;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
