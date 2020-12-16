package com.erosion.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="work_task")
public class WorkTask implements Serializable,Cloneable{
    /** 任务id;任务列表 */
    @Id
    @GeneratedValue
    private Integer id ;
    /** 任务标题;任务标题 */
    private String title ;
    /** 任务描述;任务正文 */
    private String description ;
    /** 任务提交人;提交的业主 */
    private Integer submitterId ;
    /** 任务处理人;处理任务的员工 */
    private Integer executorId ;
    /** 任务分发者;分发任务单的员工 */
    private Integer manageId ;
    /** 任务处理情况;任务完成情况(1未完成/1完成) */
    private boolean untreated ;
    /** 任务提交时间;任务创建时间 */
    private Date createTime ;

    /** 任务id;任务列表 */
    public Integer getId(){
        return this.id;
    }
    /** 任务id;任务列表 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 任务标题;任务标题 */
    public String getTitle(){
        return this.title;
    }
    /** 任务标题;任务标题 */
    public void setTitle(String title){
        this.title = title;
    }
    /** 任务描述;任务正文 */
    public String getDescription(){
        return this.description;
    }
    /** 任务描述;任务正文 */
    public void setDescription(String description){
        this.description = description;
    }
    /** 任务提交人;提交的业主 */
    public Integer getSubmitterId(){
        return this.submitterId;
    }
    /** 任务提交人;提交的业主 */
    public void setSubmitterId(Integer submitterId){
        this.submitterId = submitterId;
    }
    /** 任务处理人;处理任务的员工 */
    public Integer getExecutorId(){
        return this.executorId;
    }
    /** 任务处理人;处理任务的员工 */
    public void setExecutorId(Integer executorId){
        this.executorId = executorId;
    }
    /** 任务分发者;分发任务单的员工 */
    public Integer getManageId(){
        return this.manageId;
    }
    /** 任务分发者;分发任务单的员工 */
    public void setManageId(Integer manageId){
        this.manageId = manageId;
    }
    /** 任务处理情况;任务完成情况(1未完成/1完成) */
    public boolean getUntreated(){
        return this.untreated;
    }
    /** 任务处理情况;任务完成情况(1未完成/1完成) */
    public void setUntreated(boolean untreated){
        this.untreated = untreated;
    }
    /** 任务提交时间;任务创建时间 */
    public Date getCreateTime(){
        return this.createTime;
    }
    /** 任务提交时间;任务创建时间 */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
}