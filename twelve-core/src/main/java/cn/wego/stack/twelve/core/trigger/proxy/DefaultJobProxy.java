package cn.wego.stack.twelve.core.trigger.proxy;


import cn.wego.stack.twelve.core.trigger.SchedulerEvent;
import cn.wego.stack.twelve.core.scheduler.queue.DefaultSchedulerQueue;
import cn.wego.stack.twelve.core.scheduler.queue.SchedulerQueue;
import cn.wego.stack.twelve.core.scheduler.queue.SlaveSchedulerQueue;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class DefaultJobProxy implements JobProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultJobProxy.class);

    private SchedulerQueue schedulerQueue;

    private SchedulerQueue slaveScheduleQueue;

    public DefaultJobProxy() {
        schedulerQueue = new DefaultSchedulerQueue();
        schedulerQueue.init();
        slaveScheduleQueue = new SlaveSchedulerQueue();
    }

    @Override
    public void execute(JobExecutionContext context) {
        JobKey key = context.getJobDetail().getKey();
        Date expectTriggerTime = context.getScheduledFireTime();
        Date triggerTime = context.getFireTime();
        long delay = triggerTime.getTime() - expectTriggerTime.getTime();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("scheduler job [{}], delay time: {}ms", key.getName(), delay);
        }
        SchedulerEvent schedulerContext = buildSchedulerContext(context);
        schedulerQueue.offer(schedulerContext);
    }

    private SchedulerEvent buildSchedulerContext(JobExecutionContext context) {
        JobKey key = context.getJobDetail().getKey();
        Date expectTriggerTime = context.getScheduledFireTime();
        Date triggerTime = context.getFireTime();
        SchedulerEvent schedulerContext = new SchedulerEvent();
        Job job = new Job();
        job.setId(Integer.valueOf(key.getName()));
        schedulerContext.setJob(job);
        schedulerContext.setExpectTriggerTime(expectTriggerTime);
        schedulerContext.setFireTime(triggerTime);
        return schedulerContext;
    }
}
