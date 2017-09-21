package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Picture extends BaseObject {
    //全局唯一标识
    private String code;
    //节目描述
    private String description;
    //媒体文件url ftp://username:password@ip:port/...  标准FTP协议
    private String fileURL;

    public Picture(String elementType, String id, String action, String code) {
        super(elementType, id, action);
        this.code = code;
    }

    public Picture(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
}
