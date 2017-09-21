package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Schedule extends BaseObject{
    //全局唯一标识
    private String code;
    //频道ID
    private String ChannelID;
    //频道Code
    private String ChannelCode;
    //搜索名称供界面搜索
    private String searchName;
    //Program的默认类别（Genre）
    private String genre;
    //1: VOD5: Advertisement
    private String sourceType;
    //播放时长HHMISSFF （时分秒帧）
    private String duration;
    //描述信息
    private String description;
    //状态标志0:失效 1:生效
    private String status;
    //节目名称
    private String ProgramName;
    //节目开播日期(YYYYMMDD)
    private String StartDate;
    //节目开播时间(HH24MISS)
    private String StartTime;
    //关联的对象类型
    //1：LiveTV Program(直播频道用)
    //2：VOD Program(虚拟频道用)
    //3：LiveTV Channel(虚拟频道中引入的直播频道)
    private String ObjectType;
    //关联的对象Code
    //ObjectType为1时，填ProgramCode(对于LIVE流，原来没有相关的Program关联，需新增Program)
    //ObjectType为2时，填ProgramCode(关联已有VOD)
    //ObjectType为3时，填ChannelCode(关联已有LiveChannel)
    private String ObjectCode;

    public Schedule(String elementType, String id, String action, String code, String channelID, String channelCode, String duration, String status, String startDate, String startTime) {
        super(elementType, id, action);
        this.code = code;
        ChannelID = channelID;
        ChannelCode = channelCode;
        this.duration = duration;
        this.status = status;
        StartDate = startDate;
        StartTime = startTime;
    }

    public Schedule(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getChannelID() {
        return ChannelID;
    }

    public void setChannelID(String channelID) {
        ChannelID = channelID;
    }

    public String getChannelCode() {
        return ChannelCode;
    }

    public void setChannelCode(String channelCode) {
        ChannelCode = channelCode;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String programName) {
        ProgramName = programName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getObjectType() {
        return ObjectType;
    }

    public void setObjectType(String objectType) {
        ObjectType = objectType;
    }

    public String getObjectCode() {
        return ObjectCode;
    }

    public void setObjectCode(String objectCode) {
        ObjectCode = objectCode;
    }
}
