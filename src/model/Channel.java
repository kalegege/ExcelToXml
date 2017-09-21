package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Channel extends BaseObject{
    //全局唯一标识
    private String code;
    //节目名称
    private String name;
    //节目内容类型
    private String type;
    //节目描述
    private String description;
    //拷贝保护标志0:无拷贝保护1:有拷贝保护
    private String macrovision;
    //语言
    private String language;
    /*
    0: 其他
    1: Monaural 单声道
    2: Stereo 多声道
    3: Two-nation monaural 双单声道
    4: Two-nation stereo 双多声道
    5: AC3(5:1 channel) AC3声道*/
    private String audioType;
    /*编码格式：
            1:H.264
            2:MPEG4
            3:AVS
            4:MPEG2
            5:MP3
            6:WMV
            7:H.265*/
    private String videoType;
    //码流标志参考4。1
    private String streamType;
    //台标名称
    private String callSign;
    //时移标志0:不生效 1:生效
    private String timeShift;
    //存储时长，单位小时
    private String storageDuration;
    //默认时移时长, 单位分钟(Reserved)
    private String timeShiftDuration;
    //国家
    private String country;
    //州/省
    private String state;
    //城市
    private String city;
    //邮编
    private String zipCode;
    //当Type为1(直播频道)1: 信号源来自live2: 信号源来自virtual
    private String subType;
    //状态标志0:失效 1:生效
    private String status;
    //播放开始时间(HH24MI)
    private String startTime;
    //播放结束时间(HH24MI)
    private String endTime;
    //双语标志(0/1)
    private String bilingual;
    //Web频道入口地址当type=2时，这个属性必填。
    private String URL;
    //建议频道号
    private String channelNumber;

    public Channel(String elementType, String id, String action, String code, String name, String type, String callSign, String status, String startTime, String endTime) {
        super(elementType, id, action);
        this.code = code;
        this.name = name;
        this.type = type;
        this.callSign = callSign;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Channel(String elementType, String id, String action) {
        super(elementType, id, action);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMacrovision() {
        return macrovision;
    }

    public void setMacrovision(String macrovision) {
        this.macrovision = macrovision;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(String timeShift) {
        this.timeShift = timeShift;
    }

    public String getStorageDuration() {
        return storageDuration;
    }

    public void setStorageDuration(String storageDuration) {
        this.storageDuration = storageDuration;
    }

    public String getTimeShiftDuration() {
        return timeShiftDuration;
    }

    public void setTimeShiftDuration(String timeShiftDuration) {
        this.timeShiftDuration = timeShiftDuration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBilingual() {
        return bilingual;
    }

    public void setBilingual(String bilingual) {
        this.bilingual = bilingual;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }
}
