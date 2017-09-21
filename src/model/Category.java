package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Category extends BaseObject{
    //父节点ID
    private String parentID;
    //分类名称
    private String name;
    //显示顺序号
    private String sequence;
    //全局唯一标识
    private String code;
    //父节点Code（全局唯一标识）
    private String parentCode;
    //节目描述
    private String description;
    //状态标志0:失效 1:生效
    private String status;

    public Category(String elementType, String id, String action, String parentID, String name, String sequence, String code, String parentCode, String status) {
        super(elementType, id, action);
        this.parentID = parentID;
        this.name = name;
        this.sequence = sequence;
        this.code = code;
        this.parentCode = parentCode;
        this.status = status;
    }

    public Category(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
