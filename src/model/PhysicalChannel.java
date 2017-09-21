package model;

/**
 * Created by kale on 2017/9/21.
 */
public class PhysicalChannel extends BaseObject {
    //全局唯一标识
    private String code;
    //频道ID
    private String ChannelID;
    //频道Code
    private String ChannelCode;
    //码流2: 2M4: 4M
    private String BitRateType;
    //组播IP
    private String MultiCastIP;
    //组播端口
    private String MultiCastPort;
    //码率个数，当BizDomain为PC时必填，范围1～10
    private String BitrateCount;

    public PhysicalChannel(String elementType, String id, String action, String code, String channelID, String channelCode, String bitRateType) {
        super(elementType, id, action);
        this.code = code;
        ChannelID = channelID;
        ChannelCode = channelCode;
        BitRateType = bitRateType;
    }

    public PhysicalChannel(String elementType, String id, String action) {
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

    public String getBitRateType() {
        return BitRateType;
    }

    public void setBitRateType(String bitRateType) {
        BitRateType = bitRateType;
    }

    public String getMultiCastIP() {
        return MultiCastIP;
    }

    public void setMultiCastIP(String multiCastIP) {
        MultiCastIP = multiCastIP;
    }

    public String getMultiCastPort() {
        return MultiCastPort;
    }

    public void setMultiCastPort(String multiCastPort) {
        MultiCastPort = multiCastPort;
    }

    public String getBitrateCount() {
        return BitrateCount;
    }

    public void setBitrateCount(String bitrateCount) {
        BitrateCount = bitrateCount;
    }
}
