package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.dal.pojo.Job;

/**
 * Trigger job in special time, the job often trigger once.
 *
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TimingTrigger implements IJobTrigger {

    public void init() {

    }

    @Override
    public boolean scheduleJob(Job job) throws Exception {
        return false;
    }

    @Override
    public boolean refreshJob(Job job) throws Exception {
        return false;
    }

    @Override
    public boolean removeJob(Job job) throws Exception {
        return false;
    }
}
