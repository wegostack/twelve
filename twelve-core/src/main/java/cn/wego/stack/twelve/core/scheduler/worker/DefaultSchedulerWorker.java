package cn.wego.stack.twelve.core.scheduler.worker;

import cn.wego.stack.twelve.core.scheduler.IScheduler;
import cn.wego.stack.twelve.core.scheduler.SimpleScheduler;
import cn.wego.stack.twelve.core.trigger.SchedulerEvent;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class DefaultSchedulerWorker implements SchedulerWorker {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSchedulerWorker.class);

    @Override
    public void execute(SchedulerEvent context) {
        Job job = context.getJob();
        // choose processor by job type
        IScheduler scheduler = new SimpleScheduler();
        scheduler.schedule();
    }
}
