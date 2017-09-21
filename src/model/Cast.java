package model;

/**
 * Created by kale on 2017/9/21.
 */
public class Cast extends BaseObject{
    //全局唯一标识
    private String code;
    //节目名称
    private String name;
    //显示名称
    private String personDisplayName;
    //排序名称
    private String personSortName;
    //索引名称
    private String personSearchName;
    //姓
    private String firstName;
    //中间名
    private String MiddleName;
    //名
    private String LastName;
    //性别 0:女 1:男
    private String sex;
    //生日
    private String Birthday;
    //籍贯
    private String hometown;
    //教育程度
    private String education;
    //身高
    private String height;
    //体重
    private String weight;
    //血型
    private String bloodGroup;
    //0: 未婚1: 已婚
    private String Marriage;
    //爱好
    private String Favorite;
    //主页
    private String Webpage;
    //描述信息
    private String description;

    public Cast(String elementType, String id, String action, String code, String firstName) {
        super(elementType, id, action);
        this.code = code;
        this.firstName = firstName;
    }

    public Cast(String elementType, String id, String action) {
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

    public String getPersonDisplayName() {
        return personDisplayName;
    }

    public void setPersonDisplayName(String personDisplayName) {
        this.personDisplayName = personDisplayName;
    }

    public String getPersonSortName() {
        return personSortName;
    }

    public void setPersonSortName(String personSortName) {
        this.personSortName = personSortName;
    }

    public String getPersonSearchName() {
        return personSearchName;
    }

    public void setPersonSearchName(String personSearchName) {
        this.personSearchName = personSearchName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMarriage() {
        return Marriage;
    }

    public void setMarriage(String marriage) {
        Marriage = marriage;
    }

    public String getFavorite() {
        return Favorite;
    }

    public void setFavorite(String favorite) {
        Favorite = favorite;
    }

    public String getWebpage() {
        return Webpage;
    }

    public void setWebpage(String webpage) {
        Webpage = webpage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
