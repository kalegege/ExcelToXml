package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Package extends BaseObject {
    //全局唯一标识
    private String code;
    //媒体类型1:正片2：预览片
    private String type;
    //节目名称
    private String name;
    //索引名称供界面排序
    private String sortName;
    //搜索名称供界面搜索
    private String searchName;
    //节目订购编号
    private String orderNumber;
    //有效开始时间(YYYYMMDDHH24MiSS)
    private String licensingWindowStart;
    //有效结束时间(YYYYMMDDHH24MiSS)
    private String licensingWindowEnd;
    //状态标志0:失效 1:生效
    private String status;
    //节目描述
    private String description;
    //关键字
    private String keywords;
    //关联标签
    private String tags;
    //含税定价
    private String price;
    //租用有效期(小时)
    private String rentalPeriod;

    public Package(String elementType, String id, String action, String code, String type, String name, String orderNumber, String licensingWindowStart, String licensingWindowEnd, String status, String price) {
        super(elementType, id, action);
        this.code = code;
        this.type = type;
        this.name = name;
        this.orderNumber = orderNumber;
        this.licensingWindowStart = licensingWindowStart;
        this.licensingWindowEnd = licensingWindowEnd;
        this.status = status;
        this.price = price;
    }

    public Package(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }
}
