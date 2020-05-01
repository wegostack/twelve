package cn.wego.stack.twelve.core.scheduler.worker;

import cn.wego.stack.twelve.core.trigger.SchedulerEvent;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface SchedulerWorker {

    void execute(SchedulerEvent context);

}