package model;

/**
 * Created by kale on 2017/9/21.
 */
public class CastRoleMap extends BaseObject{
    //全局唯一标识
    private String code;
    //演职角色名称
    private String castRole;
    //人物ID
    private String castID;
    //人物Code
    private String castCode;

    public CastRoleMap(String elementType, String id, String action, String code, String castRole, String castID, String castCode) {
        super(elementType, id, action);
        this.code = code;
        this.castRole = castRole;
        this.castID = castID;
        this.castCode = castCode;
    }

    public CastRoleMap(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCastRole() {
        return castRole;
    }

    public void setCastRole(String castRole) {
        this.castRole = castRole;
    }

    public String getCastID() {
        return castID;
    }

    public void setCastID(String castID) {
        this.castID = castID;
    }

    public String getCastCode() {
        return castCode;
    }

    public void setCastCode(String castCode) {
        this.castCode = castCode;
    }
}
