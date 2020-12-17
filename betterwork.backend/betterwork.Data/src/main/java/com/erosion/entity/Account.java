package com.erosion.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="account")
public class Account implements Serializable,Cloneable{
    /** 账户唯一标识;账户的唯一标识 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 用户名;账户昵称 */
    private String username ;
    /** 用户邮箱;账户绑定邮箱 */
    private String email ;
    /** 手机号;账户手机号 */
    private String phone ;
    /** 密码;账户密码(MD5加密) */
    private String password ;
    /** 账户所有者;所有者(员工1/业主0) */
    private boolean accountType ;
    /** 账户状态;1使用/0注销 */
    private boolean status ;
    /** 是否是管理员;1管理员/0不是管理员 */
    private boolean isAdmin ;

    /** 账户唯一标识;账户的唯一标识 */
    public Integer getId(){
        return this.id;
    }
    /** 账户唯一标识;账户的唯一标识 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 用户名;账户昵称 */
    public String getUsername(){
        return this.username;
    }
    /** 用户名;账户昵称 */
    public void setUsername(String username){
        this.username = username;
    }
    /** 用户邮箱;账户绑定邮箱 */
    public String getEmail(){
        return this.email;
    }
    /** 用户邮箱;账户绑定邮箱 */
    public void setEmail(String email){
        this.email = email;
    }
    /** 手机号;账户手机号 */
    public String getPhone(){
        return this.phone;
    }
    /** 手机号;账户手机号 */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /** 密码;账户密码(MD5加密) */
    public String getPassword(){
        return this.password;
    }
    /** 密码;账户密码(MD5加密) */
    public void setPassword(String password){
        this.password = password;
    }
    /** 账户所有者;所有者(员工1/业主0) */
    public boolean getAccountType(){
        return this.accountType;
    }
    /** 账户所有者;所有者(员工1/业主0) */
    public void setAccountType(boolean accountType){
        this.accountType = accountType;
    }
    /** 账户状态;1使用/0注销 */
    public boolean getStatus(){
        return this.status;
    }
    /** 账户状态;1使用/0注销 */
    public void setStatus(boolean status){
        this.status = status;
    }
    /** 是否是管理员;1管理员/0不是管理员 */
    public boolean getIsAdmin(){
        return this.isAdmin;
    }
    /** 是否是管理员;1管理员/0不是管理员 */
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }
}