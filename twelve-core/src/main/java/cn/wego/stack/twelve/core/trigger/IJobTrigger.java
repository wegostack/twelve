package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.dal.pojo.Job;

/**
 *
 * @author zhengjianglong
 * @since 2020-04-30
 */
public interface IJobTrigger {

    boolean scheduleJob(Job job) throws Exception;

    boolean refreshJob(Job job) throws Exception;

    boolean removeJob(Job job) throws Exception;
}
