package com.erosion.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="department")
public class Department implements Serializable,Cloneable{
    /** 部门唯一标识;部门唯一标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 部门名称;部门名称 */
    private String name ;
    /** 部门所在地址;部门所在地址 */
    private String address ;
    /** 部门职责简介;部门职责简介 */
    private String information ;
    /** 部门员工总数;部门员工总数 */
    private Integer nowCount ;
    /** 期望员工总数;期望员工总数(招聘/裁员等操作) */
    private Integer wantCount ;
    /** 部门现在是否存在;部门现在是否存在 */
    private String existNow ;

    /** 部门唯一标识;部门唯一标识 */
    public Integer getId(){
        return this.id;
    }
    /** 部门唯一标识;部门唯一标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 部门名称;部门名称 */
    public String getName(){
        return this.name;
    }
    /** 部门名称;部门名称 */
    public void setName(String name){
        this.name = name;
    }
    /** 部门所在地址;部门所在地址 */
    public String getAddress(){
        return this.address;
    }
    /** 部门所在地址;部门所在地址 */
    public void setAddress(String address){
        this.address = address;
    }
    /** 部门职责简介;部门职责简介 */
    public String getInformation(){
        return this.information;
    }
    /** 部门职责简介;部门职责简介 */
    public void setInformation(String information){
        this.information = information;
    }
    /** 部门员工总数;部门员工总数 */
    public Integer getNowCount(){
        return this.nowCount;
    }
    /** 部门员工总数;部门员工总数 */
    public void setNowCount(Integer nowCount){
        this.nowCount = nowCount;
    }
    /** 期望员工总数;期望员工总数(招聘/裁员等操作) */
    public Integer getWantCount(){
        return this.wantCount;
    }
    /** 期望员工总数;期望员工总数(招聘/裁员等操作) */
    public void setWantCount(Integer wantCount){
        this.wantCount = wantCount;
    }
    /** 部门现在是否存在;部门现在是否存在 */
    public String getExistNow(){
        return this.existNow;
    }
    /** 部门现在是否存在;部门现在是否存在 */
    public void setExistNow(String existNow){
        this.existNow = existNow;
    }
}