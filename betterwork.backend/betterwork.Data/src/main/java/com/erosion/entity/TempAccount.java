package com.erosion.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="temp_account")
public class TempAccount implements Serializable,Cloneable{
    /** 唯一标识;唯一标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 用户名;用户名 */
    private String username ;
    /** 手机号;手机号 */
    private String phoneNumber ;
    /** 邮箱;邮箱(用户激活) */
    private String email ;
    /** 密码;MD5(加密)密码 */
    private String password ;
    /** 创建时间 */
    private Date createTime ;

    /** 唯一标识;唯一标识 */
    public Integer getId(){
        return this.id;
    }
    /** 唯一标识;唯一标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 用户名;用户名 */
    public String getUsername(){
        return this.username;
    }
    /** 用户名;用户名 */
    public void setUsername(String username){
        this.username = username;
    }
    /** 手机号;手机号 */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    /** 手机号;手机号 */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /** 邮箱;邮箱(用户激活) */
    public String getEmail(){
        return this.email;
    }
    /** 邮箱;邮箱(用户激活) */
    public void setEmail(String email){
        this.email = email;
    }
    /** 密码;MD5(加密)密码 */
    public String getPassword(){
        return this.password;
    }
    /** 密码;MD5(加密)密码 */
    public void setPassword(String password){
        this.password = password;
    }
    /** 创建时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 创建时间 */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
}