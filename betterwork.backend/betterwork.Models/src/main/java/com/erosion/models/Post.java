package com.erosion.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="post")
public class Post implements Serializable,Cloneable{
    /** 岗位唯一标识;职务标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 岗位名称;岗位的名称 */
    private String name ;
    /** 岗位的职责信息;岗位信息简介 */
    private String jobDesc ;
    /** 岗位最低薪资;岗位应给予的最低薪资 */
    private Double minMoney ;
    /** 岗位最高薪资;岗位应给予的最高薪资 */
    private Double maxMoney ;
    /** 岗位现在是否存在;岗位现是否已经废除 */
    private String existNow ;
    /** 岗位权限;岗位的权限(比如操作员工等) */
    private Integer authorization ;

    /** 岗位唯一标识;职务标识 */
    public Integer getId(){
        return this.id;
    }
    /** 岗位唯一标识;职务标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 岗位名称;岗位的名称 */
    public String getName(){
        return this.name;
    }
    /** 岗位名称;岗位的名称 */
    public void setName(String name){
        this.name = name;
    }
    /** 岗位的职责信息;岗位信息简介 */
    public String getJobDesc(){
        return this.jobDesc;
    }
    /** 岗位的职责信息;岗位信息简介 */
    public void setJobDesc(String jobDesc){
        this.jobDesc = jobDesc;
    }
    /** 岗位最低薪资;岗位应给予的最低薪资 */
    public Double getMinMoney(){
        return this.minMoney;
    }
    /** 岗位最低薪资;岗位应给予的最低薪资 */
    public void setMinMoney(Double minMoney){
        this.minMoney = minMoney;
    }
    /** 岗位最高薪资;岗位应给予的最高薪资 */
    public Double getMaxMoney(){
        return this.maxMoney;
    }
    /** 岗位最高薪资;岗位应给予的最高薪资 */
    public void setMaxMoney(Double maxMoney){
        this.maxMoney = maxMoney;
    }
    /** 岗位现在是否存在;岗位现是否已经废除 */
    public String getExistNow(){
        return this.existNow;
    }
    /** 岗位现在是否存在;岗位现是否已经废除 */
    public void setExistNow(String existNow){
        this.existNow = existNow;
    }
    /** 岗位权限;岗位的权限(比如操作员工等) */
    public Integer getAuthorization(){
        return this.authorization;
    }
    /** 岗位权限;岗位的权限(比如操作员工等) */
    public void setAuthorization(Integer authorization){
        this.authorization = authorization;
    }
}