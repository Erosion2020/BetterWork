package com.erosion.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="education_experience")
public class EducationExperience implements Serializable,Cloneable{
    /** 唯一标识;唯一标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 学校姓名;学校名称 */
    private String schoolName ;
    /** 入学时间;入学时间 */
    private Date startTime ;
    /** 毕业时间;毕业时间 */
    private Date endTime ;
    /** 专业;大学所在专业 */
    private String mojor ;
    /** 学历;本科/专科/硕士/博士 */
    private String education ;

    /** 唯一标识;唯一标识 */
    public Integer getId(){
        return this.id;
    }
    /** 唯一标识;唯一标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 学校姓名;学校名称 */
    public String getSchoolName(){
        return this.schoolName;
    }
    /** 学校姓名;学校名称 */
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    /** 入学时间;入学时间 */
    public Date getStartTime(){
        return this.startTime;
    }
    /** 入学时间;入学时间 */
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }
    /** 毕业时间;毕业时间 */
    public Date getEndTime(){
        return this.endTime;
    }
    /** 毕业时间;毕业时间 */
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }
    /** 专业;大学所在专业 */
    public String getMojor(){
        return this.mojor;
    }
    /** 专业;大学所在专业 */
    public void setMojor(String mojor){
        this.mojor = mojor;
    }
    /** 学历;本科/专科/硕士/博士 */
    public String getEducation(){
        return this.education;
    }
    /** 学历;本科/专科/硕士/博士 */
    public void setEducation(String education){
        this.education = education;
    }
}