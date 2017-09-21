package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Movie extends BaseObject {
    //全局唯一标识
    private String code;
    //媒体类型1:正片2：预览片
    private String type;
    //媒体文件url ftp://username:password@ip:port/...  标准FTP协议
    private String fileURL;
    //0: No DRM1: BES DRM
    private String sourceDRMType;
    //0: No DRM1: BES DRM
    private String destDRMType;
    /*
    0: 其他
    1: Monaural 单声道
    2: Stereo 多声道
    3: Two-nation monaural 双单声道
    4: Two-nation stereo 双多声道
    5: AC3(5:1 channel) AC3声道*/
    private String audioType;
    //0: 4x31: 16x9(Wide)
    private String screenFormat;
    //字幕标志0:无字幕1:有字幕
    private String closedCaptioning;
    //在海量存储中的视频URL，类似Rtsp://ip:port/1/2/3.ts
    private String OCSURL;
    //播放时长HHMISSFF （时分秒帧）
    private String duration;
    //文件大小，单位为Byte
    private String fileSize;
    /*码流
    1:1.6M
    2:2.1M
    3:8M
    4:60k
    5:150k
    51：1.3M（标清VBR）
            52：2M（标清VBR）
            53：4M（高清VBR）
            54：6M（超清VBR）
            55：2.3M（高清VBR）
            56：25M（4K H264 VBR）
            57：14M（4K H264 VBR）
            58：15M（4K H265 VBR）
            59：8M（4K H265 VBR）

            310: 18M（4K VBR）
            311: 21M（4K VBR）*/
    private String bitRateType;
    /*编码格式：
            1:H.264
            2:MPEG4
            3:AVS
            4:MPEG2
            5:MP3
            6:WMV
            7:H.265*/
    private String videoType;
    /*编码格式：
            1.	MP2
            2.	AAC
            3.	AMR*/
    private String audioFormat;
    /*分辨率类型
    1:QCIF
    2:QVGA
    3:2/3 D1
    4:3/4 D1
    5:D1
    6:720P
    7:1080i
    8:1080P
    9:4K(3840*2160)
    10:4K(4096*2160)*/
    private String resolution;
    /*1:Simple
    2:Advanced Simple
    3:Baseline
    4:Main
    5:High
    6:JiZhun*/
    private String videoProfile;
    //1:TS2:3GP3:MP4
    private String systemLayer;
    //服务类型:0x01：在线播放(默认)0x10：支持下载0X11:  在线播放+下载
    private String serviceType;

    public Movie(String elementType, String id, String action, String code, String type, String fileURL) {
        super(elementType, id, action);
        this.code = code;
        this.type = type;
        this.fileURL = fileURL;
    }

    public Movie(String elementType, String id, String action) {
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

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getSourceDRMType() {
        return sourceDRMType;
    }

    public void setSourceDRMType(String sourceDRMType) {
        this.sourceDRMType = sourceDRMType;
    }

    public String getDestDRMType() {
        return destDRMType;
    }

    public void setDestDRMType(String destDRMType) {
        this.destDRMType = destDRMType;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getScreenFormat() {
        return screenFormat;
    }

    public void setScreenFormat(String screenFormat) {
        this.screenFormat = screenFormat;
    }

    public String getClosedCaptioning() {
        return closedCaptioning;
    }

    public void setClosedCaptioning(String closedCaptioning) {
        this.closedCaptioning = closedCaptioning;
    }

    public String getOCSURL() {
        return OCSURL;
    }

    public void setOCSURL(String OCSURL) {
        this.OCSURL = OCSURL;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getBitRateType() {
        return bitRateType;
    }

    public void setBitRateType(String bitRateType) {
        this.bitRateType = bitRateType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getVideoProfile() {
        return videoProfile;
    }

    public void setVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
    }

    public String getSystemLayer() {
        return systemLayer;
    }

    public void setSystemLayer(String systemLayer) {
        this.systemLayer = systemLayer;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
