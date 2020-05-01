package cn.wego.stack.twelve.core.invoker.worker;

import cn.wego.stack.twelve.core.scheduler.SchedulerContext;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface IWorker {

    void execute(SchedulerContext context);
}