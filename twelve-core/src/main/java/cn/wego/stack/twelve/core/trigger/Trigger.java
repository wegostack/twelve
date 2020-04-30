package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.dal.pojo.Job;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
public interface Trigger {

    boolean addJob(Job job);

    boolean updateJob(Job job);

    boolean removeJob(Job job);
}
