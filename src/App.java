import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by kale on 2017/9/20.
 */
public class App extends JFrame implements ActionListener {

    private JPanel panel;
    private File file = null;

    private JTextArea jt;

    public App(){
        init();
    }

    public void init(){
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400,400);
        panel= new JPanel();
        panel.setSize(400,400);
        panel.setLayout(new GridLayout(1, 1));
        panel.setBackground(Color.white);
        //panel.setLocation(0, 100);

        jt= new JTextArea();
        jt.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jt);
//        jt.addKeyListener(this);
        panel.add(jsp);

        JMenuBar jmb = new JMenuBar();
        jmb.setLayout(new FlowLayout(FlowLayout.LEFT));
        JMenu jm = new JMenu("菜单");

        JMenuItem jmi1 = new JMenuItem("关闭 ctrl+e");
        JMenuItem jmi2 = new JMenuItem("保存ctrl+s");
        JMenuItem jmi3 = new JMenuItem("另存为");
        JMenuItem jmi4 = new JMenuItem("打开ctrl+o");

        jmi1.addActionListener(this);
        jmi2.addActionListener(this);
        jmi3.addActionListener(this);
        jmi4.addActionListener(this);

        jm.add(jmi4);
        jm.add(jmi2);
        jm.add(jmi3);
        jm.add(jmi1);
        jmb.add(jm);
        this.setJMenuBar(jmb);
        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String[] args){
        new App();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if("打开ctrl+o".equals(cmd)){
            read();
        }
        if("关闭ctrl+e".equals(cmd)) {
            System.exit(0);
        }
        if("保存ctrl+s".equals(cmd)){
            save();
        }
        if("另存为".equals(cmd)){
            resave();
        }
    }

    public void read() {

        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jfc);
        file= jfc.getSelectedFile();
        try{
            if(file != null) {
                FileInputStream in = new FileInputStream(file);
                InputStreamReader ipr = new InputStreamReader(in, "GBK");
                BufferedReader bf = new BufferedReader(ipr);

                String str = "";
                while((str=bf.readLine()) != null) {
                    jt.append(str);
                }
            }

        }catch (FileNotFoundException e) {
            System.out.println("打开文件失败");
        }catch (IOException e) {
            System.out.println("打开文件失败");
        }

    }

    public void save() {

        if(file == null) {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(jfc);
            file= jfc.getSelectedFile();
            if(file != null) {
                try{
                    file.createNewFile();
                }catch (IOException e) {
                    //TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        OutputStreamWriter out = null;
        if(file != null) {
            try{
                FileOutputStream fos= new FileOutputStream(file);
                out= new OutputStreamWriter(fos, "GBK");

                out.write(jt.getText());
                out.flush();
                out.close();
            }catch (IOException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void resave() {

        JFileChooser jfc = new JFileChooser();
        jfc.showSaveDialog(jfc);
        file= jfc.getSelectedFile();
        if(file != null) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        OutputStreamWriter out = null;
        if(file != null) {
            try{
                FileOutputStream fos= new FileOutputStream(file);
                out= new OutputStreamWriter(fos, "GBK");

                out.write(jt.getText());
                out.flush();
                out.close();
            }catch (IOException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
