package cn.wego.stack.twelve.core.scheduler.queue;

import cn.wego.stack.twelve.core.scheduler.SchedulerContext;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class SlaveSchedulerQueue implements SchedulerQueue {

    @Override
    public void init() {

    }

    @Override
    public boolean offer(SchedulerContext context) {
        return false;
    }
}
