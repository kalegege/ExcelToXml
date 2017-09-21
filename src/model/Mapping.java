package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Mapping extends BaseObject {
    //父元素类型(支持的类型请参考下表)
    private String parentType;
    //父元素ID
    private String parentID;
    //元素ID
    private String elementID;
    //父元素Code(全局唯一)
    private String parentCode;
    //元素Code(全局唯一)
    private String elementCode;
    /*映射时的类型
    当Mapping的ParentType为Picture时：
    0: 缩略图
    1: 海报
    2: 剧照
    3: 图标
    4: 标题图
    5: 广告图
    6: 草图
    7: 背景图
    9: 频道图片
    10: 频道黑白图片
    11: 频道Logo
    12: 频道名字图片
    99: 其他*/
    private String type;
    //序列号
    private String sequence;
    //当Mapping的ParentType为SVOD时, 标识SVOD节目的服务起始时间(YYYYMMDDHH24MiSS)
    private String validStart;
    //当Mapping的ParentType为SVOD时, 标识SVOD节目的服务终止时间(YYYYMMDDHH24MiSS)
    private String validEnd;

    public Mapping(String elementType, String id, String action, String parentType, String parentID, String elementID, String parentCode, String elementCode) {
        super(elementType, id, action);
        this.parentType = parentType;
        this.parentID = parentID;
        this.elementID = elementID;
        this.parentCode = parentCode;
        this.elementCode = elementCode;
    }

    public Mapping(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getElementID() {
        return elementID;
    }

    public void setElementID(String elementID) {
        this.elementID = elementID;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getValidStart() {
        return validStart;
    }

    public void setValidStart(String validStart) {
        this.validStart = validStart;
    }

    public String getValidEnd() {
        return validEnd;
    }

    public void setValidEnd(String validEnd) {
        this.validEnd = validEnd;
    }
}
