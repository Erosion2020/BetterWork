package com.erosion.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="owner_contacts")
public class OwnerContacts implements Serializable,Cloneable{
    /** 唯一标识;业主紧急联系人 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 业主id;关联业主id */
    private Integer ownerId ;
    /** 姓名;联系人姓名 */
    private String name ;
    /** 关系;联系人与业主的关系 */
    private String relation ;
    /** 手机号;联系人手机号 */
    private String phone ;

    /** 唯一标识;业主紧急联系人 */
    public Integer getId(){
        return this.id;
    }
    /** 唯一标识;业主紧急联系人 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 业主id;关联业主id */
    public Integer getOwnerId(){
        return this.ownerId;
    }
    /** 业主id;关联业主id */
    public void setOwnerId(Integer ownerId){
        this.ownerId = ownerId;
    }
    /** 姓名;联系人姓名 */
    public String getName(){
        return this.name;
    }
    /** 姓名;联系人姓名 */
    public void setName(String name){
        this.name = name;
    }
    /** 关系;联系人与业主的关系 */
    public String getRelation(){
        return this.relation;
    }
    /** 关系;联系人与业主的关系 */
    public void setRelation(String relation){
        this.relation = relation;
    }
    /** 手机号;联系人手机号 */
    public String getPhone(){
        return this.phone;
    }
    /** 手机号;联系人手机号 */
    public void setPhone(String phone){
        this.phone = phone;
    }
}