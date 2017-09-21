package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Film extends BaseObject {

    //节目名称
    private String name;
    //全局唯一标识
    private String code;
    //节目订购编号
    private String orderNumber;
    //原名
    private String originalName;
    //索引名称供界面排序
    private String sortName;
    //搜索名称供界面搜索
    private String searchName;
    //首播日期(YYYYMMDD)
    private String orgAirDate;
    //有效开始时间(YYYYMMDDHH24MiSS)
    private String licensingWindowStart;
    //有效结束时间(YYYYMMDDHH24MiSS)
    private String licensingWindowEnd;
    //新到天数
    private String displayAsNew;
    //剩余天数
    private String displayAsLastChance;
    //拷贝保护标志0:无拷贝保护1:有拷贝保护
    private String macrovision;
    //状态标志0:失效 1:生效
    private String status;
    //节目描述
    private String description;
    //节目内容类型
    private String type;
    //关键字
    private String keywords;
    //关联标签
    private String tags;
    //关联内容唯一标识
    private String rMediaCode;

    public Film(String elementType, String id, String action, String name, String code, String licensingWindowStart, String licensingWindowEnd, String type) {
        super(elementType, id, action);
        this.name = name;
        this.code = code;
        this.licensingWindowStart = licensingWindowStart;
        this.licensingWindowEnd = licensingWindowEnd;
        this.type = type;
    }

    public Film(String elementType, String id, String action, String name, String code, String type) {
        super(elementType, id, action);
        this.name = name;
        this.code = code;
        this.type = type;
    }

    public Film(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getOrgAirDate() {
        return orgAirDate;
    }

    public void setOrgAirDate(String orgAirDate) {
        this.orgAirDate = orgAirDate;
    }

    public String getLicensingWindowStart() {
        return licensingWindowStart;
    }

    public void setLicensingWindowStart(String licensingWindowStart) {
        this.licensingWindowStart = licensingWindowStart;
    }

    public String getLicensingWindowEnd() {
        return licensingWindowEnd;
    }

    public void setLicensingWindowEnd(String licensingWindowEnd) {
        this.licensingWindowEnd = licensingWindowEnd;
    }

    public String getDisplayAsNew() {
        return displayAsNew;
    }

    public void setDisplayAsNew(String displayAsNew) {
        this.displayAsNew = displayAsNew;
    }

    public String getDisplayAsLastChance() {
        return displayAsLastChance;
    }

    public void setDisplayAsLastChance(String displayAsLastChance) {
        this.displayAsLastChance = displayAsLastChance;
    }

    public String getMacrovision() {
        return macrovision;
    }

    public void setMacrovision(String macrovision) {
        this.macrovision = macrovision;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getrMediaCode() {
        return rMediaCode;
    }

    public void setrMediaCode(String rMediaCode) {
        this.rMediaCode = rMediaCode;
    }
}
