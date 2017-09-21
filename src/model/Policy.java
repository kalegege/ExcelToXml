package model;

/**
 * Created by kale on 2017/9/19.
 */
public class Policy {
    private String fileName;
    private String fileType;
    private String contentIndex;
    private String area;
    private String year;
    private String actor;
    private String director;
    private String interest;
    private String content;
    private String contentCompany;
    private String startTime;
    private String stopTime;
    private String series;

    public Policy(String startTime, String stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public Policy(String fileName, String fileType, String contentIndex, String area, String year, String actor, String director, String interest, String content, String contentCompany, String startTime, String stopTime, String series) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.contentIndex = contentIndex;
        this.area = area;
        this.year = year;
        this.actor = actor;
        this.director = director;
        this.interest = interest;
        this.content = content;
        this.contentCompany = contentCompany;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.series = series;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(String contentIndex) {
        this.contentIndex = contentIndex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentCompany() {
        return contentCompany;
    }

    public void setContentCompany(String contentCompany) {
        this.contentCompany = contentCompany;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
