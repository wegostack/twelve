package cn.wego.stack.twelve.core.scheduler.queue;

import cn.wego.stack.twelve.core.scheduler.SchedulerContext;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface SchedulerQueue {

    void init();

    boolean offer(SchedulerContext context);

}
