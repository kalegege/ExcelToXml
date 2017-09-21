package model;

/**
 * 节目信息
 * Created by kale on 2017/9/21.
 */
public class Program extends Film {
    //语言
    private String language;
    //Program的默认类别（Genre）
    private String genre;
    //演员列表(只供显示)
    private String actorDisplay;
    //作者列表(只供显示)
    private String writerDisplay;
    //国家地区
    private String originalCountry;
    //上映年份(YYYY)
    private String releaseYear;
    //列表定价
    private String priceTaxIn;
    //1: VOD5: Advertisement
    private String sourceType;
    //0: 普通VOD1: 连续剧剧集
    private String seriesFlag;
    /*存储分发策略要求：
    0. 厂商CDN可不要存储本节目（在海量存储中保存，具体视频路径在Movie.OCSURL）
    1. 厂商CDN存储本节目
    2. 自定义策略（具体对应策略在厂商系统中定义，可以做到部分节点覆盖，或者后拉视频文件…）*/
    private String storageType;
    /*节目清晰度标识
    0：标清
    1：高清
    2：超清
    3. 4K
    4.杜比*/
    private String definitionFlag;

    public Program( String id, String code, String action, String name, String type, String definitionFlag) {
        super("Program", id, action,name,code,type);
        this.definitionFlag = definitionFlag;
    }

    public Program( String id, String action) {
        super("Program", id, action);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActorDisplay() {
        return actorDisplay;
    }

    public void setActorDisplay(String actorDisplay) {
        this.actorDisplay = actorDisplay;
    }

    public String getWriterDisplay() {
        return writerDisplay;
    }

    public void setWriterDisplay(String writerDisplay) {
        this.writerDisplay = writerDisplay;
    }

    public String getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(String originalCountry) {
        this.originalCountry = originalCountry;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getPriceTaxIn() {
        return priceTaxIn;
    }

    public void setPriceTaxIn(String priceTaxIn) {
        this.priceTaxIn = priceTaxIn;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSeriesFlag() {
        return seriesFlag;
    }

    public void setSeriesFlag(String seriesFlag) {
        this.seriesFlag = seriesFlag;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getDefinitionFlag() {
        return definitionFlag;
    }

    public void setDefinitionFlag(String definitionFlag) {
        this.definitionFlag = definitionFlag;
    }
}
