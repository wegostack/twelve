package cn.wego.stack.twelve.core.scheduler.queue;

import cn.wego.stack.twelve.core.trigger.SchedulerEvent;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class SlaveSchedulerQueue implements SchedulerQueue {

    @Override
    public void init() {

    }

    @Override
    public boolean offer(SchedulerEvent context) {
        return false;
    }
}
