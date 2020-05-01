package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.dal.pojo.Job;

import java.util.Date;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class SchedulerEvent {
    private Job job;
    private Date expectTriggerTime;
    private Date fireTime;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Date getExpectTriggerTime() {
        return expectTriggerTime;
    }

    public void setExpectTriggerTime(Date expectTriggerTime) {
        this.expectTriggerTime = expectTriggerTime;
    }

    public Date getFireTime() {
        return fireTime;
    }

    public void setFireTime(Date fireTime) {
        this.fireTime = fireTime;
    }
}
