package com.erosion.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="owner")
public class Owner implements Serializable,Cloneable{
    /** 唯一标识;业主唯一标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 姓名;业主姓名 */
    private String name ;
    /** 拥有账户;业主所拥有的账户 */
    private Integer accountId ;
    /** 性别;业主性别 */
    private boolean gender ;
    /** 身份证号;业主身份证号 */
    private String identityNumber ;
    /** 工作单位;业主的工作单位/公司/组织 */
    private String organization ;
    /** 住址;业主的具体住址 */
    private String address ;
    /** 联系方式(手机号);业主的联系方式 */
    private String phone ;
    /** 业主状态(现在是否仍是业主);1业主/0已不是 现在是否仍是业主 */
    private boolean ownerStatus ;

    /** 唯一标识;业主唯一标识 */
    public Integer getId(){
        return this.id;
    }
    /** 唯一标识;业主唯一标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 姓名;业主姓名 */
    public String getName(){
        return this.name;
    }
    /** 姓名;业主姓名 */
    public void setName(String name){
        this.name = name;
    }
    /** 拥有账户;业主所拥有的账户 */
    public Integer getAccountId(){
        return this.accountId;
    }
    /** 拥有账户;业主所拥有的账户 */
    public void setAccountId(Integer accountId){
        this.accountId = accountId;
    }
    /** 性别;业主性别 */
    public boolean getGender(){
        return this.gender;
    }
    /** 性别;业主性别 */
    public void setGender(boolean gender){
        this.gender = gender;
    }
    /** 身份证号;业主身份证号 */
    public String getIdentityNumber(){
        return this.identityNumber;
    }
    /** 身份证号;业主身份证号 */
    public void setIdentityNumber(String identityNumber){
        this.identityNumber = identityNumber;
    }
    /** 工作单位;业主的工作单位/公司/组织 */
    public String getOrganization(){
        return this.organization;
    }
    /** 工作单位;业主的工作单位/公司/组织 */
    public void setOrganization(String organization){
        this.organization = organization;
    }
    /** 住址;业主的具体住址 */
    public String getAddress(){
        return this.address;
    }
    /** 住址;业主的具体住址 */
    public void setAddress(String address){
        this.address = address;
    }
    /** 联系方式(手机号);业主的联系方式 */
    public String getPhone(){
        return this.phone;
    }
    /** 联系方式(手机号);业主的联系方式 */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /** 业主状态(现在是否仍是业主);1业主/0已不是 现在是否仍是业主 */
    public boolean getOwnerStatus(){
        return this.ownerStatus;
    }
    /** 业主状态(现在是否仍是业主);1业主/0已不是 现在是否仍是业主 */
    public void setOwnerStatus(boolean ownerStatus){
        this.ownerStatus = ownerStatus;
    }
}