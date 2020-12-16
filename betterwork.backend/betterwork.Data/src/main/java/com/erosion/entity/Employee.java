package com.erosion.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="employee")
public class Employee implements Serializable,Cloneable{
    /** 唯一标识;查询主键 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 员工姓名;员工姓名 */
    private String name ;
    /** 拥有账户;账户id */
    private Integer accountId ;
    /** 员工性别;男/女 */
    private boolean gender ;
    /** 员工民族;员工名族 */
    private String nation ;
    /** 员工出生年月;员工出生时间-庆生-集体活动等 */
    private Date birth ;
    /** 员工身份证号;员工的身份证号 */
    private String identityNumber ;
    /** 政治面貌;共青团员/中央党员......等 */
    private String politicalOutlook ;
    /** 入职时间;员工入职的时间-方便统计薪资等数据 */
    private Date entryTime ;
    /** 户口性质;农业1/非农业0 */
    private boolean registerResidenNature ;
    /** 户口所在地;户口信息所在地 */
    private String registerResidenPlace ;
    /** 联系方式/手机号码;员工联系方式 */
    private String phoneNumber ;
    /** 教育经历;员工教育经历 */
    private Integer educationExperienceId ;
    /** 婚姻状况;员工感情情况(未婚/已婚/离异/丧偶/空白) */
    private String emotion ;
    /** 岗位信息;员工所担任的岗位(岗位id) */
    private Integer postId ;
    /** 家庭地址(现居住地址);员工住址 */
    private String homeAddress ;
    /** 薪资;员工薪资 */
    private Double salary ;
    /** 在职情况;员工(在职1/离职0) */
    private boolean isOnJob ;

    /** 唯一标识;查询主键 */
    public Integer getId(){
        return this.id;
    }
    /** 唯一标识;查询主键 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 员工姓名;员工姓名 */
    public String getName(){
        return this.name;
    }
    /** 员工姓名;员工姓名 */
    public void setName(String name){
        this.name = name;
    }
    /** 拥有账户;账户id */
    public Integer getAccountId(){
        return this.accountId;
    }
    /** 拥有账户;账户id */
    public void setAccountId(Integer accountId){
        this.accountId = accountId;
    }
    /** 员工性别;男/女 */
    public boolean getGender(){
        return this.gender;
    }
    /** 员工性别;男/女 */
    public void setGender(boolean gender){
        this.gender = gender;
    }
    /** 员工民族;员工名族 */
    public String getNation(){
        return this.nation;
    }
    /** 员工民族;员工名族 */
    public void setNation(String nation){
        this.nation = nation;
    }
    /** 员工出生年月;员工出生时间-庆生-集体活动等 */
    public Date getBirth(){
        return this.birth;
    }
    /** 员工出生年月;员工出生时间-庆生-集体活动等 */
    public void setBirth(Date birth){
        this.birth = birth;
    }
    /** 员工身份证号;员工的身份证号 */
    public String getIdentityNumber(){
        return this.identityNumber;
    }
    /** 员工身份证号;员工的身份证号 */
    public void setIdentityNumber(String identityNumber){
        this.identityNumber = identityNumber;
    }
    /** 政治面貌;共青团员/中央党员......等 */
    public String getPoliticalOutlook(){
        return this.politicalOutlook;
    }
    /** 政治面貌;共青团员/中央党员......等 */
    public void setPoliticalOutlook(String politicalOutlook){
        this.politicalOutlook = politicalOutlook;
    }
    /** 入职时间;员工入职的时间-方便统计薪资等数据 */
    public Date getEntryTime(){
        return this.entryTime;
    }
    /** 入职时间;员工入职的时间-方便统计薪资等数据 */
    public void setEntryTime(Date entryTime){
        this.entryTime = entryTime;
    }
    /** 户口性质;农业1/非农业0 */
    public boolean getRegisterResidenNature(){
        return this.registerResidenNature;
    }
    /** 户口性质;农业1/非农业0 */
    public void setRegisterResidenNature(boolean registerResidenNature){
        this.registerResidenNature = registerResidenNature;
    }
    /** 户口所在地;户口信息所在地 */
    public String getRegisterResidenPlace(){
        return this.registerResidenPlace;
    }
    /** 户口所在地;户口信息所在地 */
    public void setRegisterResidenPlace(String registerResidenPlace){
        this.registerResidenPlace = registerResidenPlace;
    }
    /** 联系方式/手机号码;员工联系方式 */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    /** 联系方式/手机号码;员工联系方式 */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /** 教育经历;员工教育经历 */
    public Integer getEducationExperienceId(){
        return this.educationExperienceId;
    }
    /** 教育经历;员工教育经历 */
    public void setEducationExperienceId(Integer educationExperienceId){
        this.educationExperienceId = educationExperienceId;
    }
    /** 婚姻状况;员工感情情况(未婚/已婚/离异/丧偶/空白) */
    public String getEmotion(){
        return this.emotion;
    }
    /** 婚姻状况;员工感情情况(未婚/已婚/离异/丧偶/空白) */
    public void setEmotion(String emotion){
        this.emotion = emotion;
    }
    /** 岗位信息;员工所担任的岗位(岗位id) */
    public Integer getPostId(){
        return this.postId;
    }
    /** 岗位信息;员工所担任的岗位(岗位id) */
    public void setPostId(Integer postId){
        this.postId = postId;
    }
    /** 家庭地址(现居住地址);员工住址 */
    public String getHomeAddress(){
        return this.homeAddress;
    }
    /** 家庭地址(现居住地址);员工住址 */
    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }
    /** 薪资;员工薪资 */
    public Double getSalary(){
        return this.salary;
    }
    /** 薪资;员工薪资 */
    public void setSalary(Double salary){
        this.salary = salary;
    }
    /** 在职情况;员工(在职1/离职0) */
    public boolean getIsOnJob(){
        return this.isOnJob;
    }
    /** 在职情况;员工(在职1/离职0) */
    public void setIsOnJob(boolean isOnJob){
        this.isOnJob = isOnJob;
    }
}