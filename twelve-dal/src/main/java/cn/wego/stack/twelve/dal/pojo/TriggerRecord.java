package cn.wego.stack.twelve.dal.pojo;

import java.util.Date;

public class TriggerRecord {
    private Long id;

    private Long jobId;

    private Date expectTriggerTime;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Date getExpectTriggerTime() {
        return expectTriggerTime;
    }

    public void setExpectTriggerTime(Date expectTriggerTime) {
        this.expectTriggerTime = expectTriggerTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}