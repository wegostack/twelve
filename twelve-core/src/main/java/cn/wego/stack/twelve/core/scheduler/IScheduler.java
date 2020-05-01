package cn.wego.stack.twelve.core.scheduler;

import cn.wego.stack.twelve.dal.pojo.Job;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
public interface IScheduler {

    boolean scheduleJob(Job job) throws Exception;

    boolean refreshJob(Job job) throws Exception;

    boolean removeJob(Job job) throws Exception;
}
