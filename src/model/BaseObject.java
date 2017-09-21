package model;

/**
 * 1Program节目信息
 * 2Movie媒体内容信息
 * 3Cast演员信息
 * 4CastRoleMap演员角色信息
 * 5ChannelTV频道信息
 * 6PhysicalChannel频道物理参数信息
 * 7ScheduleTV时刻表信息
 * 8Picture图片信息
 * 9Category编排目录信息
 * 10Series连续剧
 * 业务套餐管理
 * 11Package包信息
 * Created by kale on 2017/9/21.
 */
public class BaseObject {
    //elementtype
    private String elementType;
    //接口中唯一标识
    private String id;
    //操作类型
    private String action;
    //0: 成功其他: 错误代码
    private String result;
    //错误描述
    private String errorDescription;

    public BaseObject(String elementType, String id, String action) {
        this.elementType = elementType;
        this.id = id;
        this.action = action;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
