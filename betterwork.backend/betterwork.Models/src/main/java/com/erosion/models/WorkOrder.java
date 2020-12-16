package com.erosion.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="work_order")
public class WorkOrder implements Serializable,Cloneable{
    /** 工单id;工单编号 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 工单标题;工单标题 */
    private String title ;
    /** 工单描述;工单具体内容描述 */
    private String description ;
    /** 工单提交人;提交工单的员工 */
    private Integer submitterId ;
    /** 工单处理人;处理工单的员工 */
    private Integer executorId ;
    /** 工单分发者;分发任务的人员 */
    private Integer manageId ;
    /** 工单处理情况;工单处理情况(1未处理/0已处理) */
    private boolean untreated ;
    /** 工单提交时间;工单提交时间 */
    private Date createTime ;

    /** 工单id;工单编号 */
    public Integer getId(){
        return this.id;
    }
    /** 工单id;工单编号 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 工单标题;工单标题 */
    public String getTitle(){
        return this.title;
    }
    /** 工单标题;工单标题 */
    public void setTitle(String title){
        this.title = title;
    }
    /** 工单描述;工单具体内容描述 */
    public String getDescription(){
        return this.description;
    }
    /** 工单描述;工单具体内容描述 */
    public void setDescription(String description){
        this.description = description;
    }
    /** 工单提交人;提交工单的员工 */
    public Integer getSubmitterId(){
        return this.submitterId;
    }
    /** 工单提交人;提交工单的员工 */
    public void setSubmitterId(Integer submitterId){
        this.submitterId = submitterId;
    }
    /** 工单处理人;处理工单的员工 */
    public Integer getExecutorId(){
        return this.executorId;
    }
    /** 工单处理人;处理工单的员工 */
    public void setExecutorId(Integer executorId){
        this.executorId = executorId;
    }
    /** 工单分发者;分发任务的人员 */
    public Integer getManageId(){
        return this.manageId;
    }
    /** 工单分发者;分发任务的人员 */
    public void setManageId(Integer manageId){
        this.manageId = manageId;
    }
    /** 工单处理情况;工单处理情况(1未处理/0已处理) */
    public boolean getUntreated(){
        return this.untreated;
    }
    /** 工单处理情况;工单处理情况(1未处理/0已处理) */
    public void setUntreated(boolean untreated){
        this.untreated = untreated;
    }
    /** 工单提交时间;工单提交时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 工单提交时间;工单提交时间 */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
}