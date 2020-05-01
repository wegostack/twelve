package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.core.trigger.proxy.DefaultJobProxy;
import cn.wego.stack.twelve.core.trigger.proxy.TwelveJobFactory;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
public class CronTrigger implements IJobTrigger {

    private Scheduler scheduler;

    /**
     * init scheduler
     *
     * @throws Exception
     */
    public void init() throws Exception {
        if (scheduler != null) {
            return;
        }

        synchronized (IJobTrigger.class) {
            if (scheduler == null) {
                scheduler = StdSchedulerFactory.getDefaultScheduler();
                scheduler.setJobFactory(new TwelveJobFactory());
                scheduler.start();
            }
        }
    }

    @Override
    public boolean scheduleJob(Job job) throws Exception {
        JobKey key = new JobKey(String.valueOf(job.getId()), Scheduler.DEFAULT_GROUP);
        TriggerBuilder triggerBuilder = TriggerBuilder.newTrigger()
                .withIdentity(String.valueOf(job.getId()), Scheduler.DEFAULT_GROUP);
        JobDetail jobDetail = JobBuilder.newJob(DefaultJobProxy.class)
                .withIdentity(key).build();
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCron());
        triggerBuilder.withSchedule(cronScheduleBuilder);
        scheduler.scheduleJob(jobDetail, triggerBuilder.build());
        return true;
    }

    @Override
    public boolean refreshJob(Job job) throws Exception {
        JobKey key = new JobKey(String.valueOf(job.getId()), Scheduler.DEFAULT_GROUP);
        if (scheduler.checkExists(key)) {
            scheduler.deleteJob(key);
        }

        return scheduleJob(job);
    }

    @Override
    public boolean removeJob(Job job) throws Exception {
        JobKey key = new JobKey(String.valueOf(job.getId()), Scheduler.DEFAULT_GROUP);
        if (scheduler.checkExists(key)) {
            scheduler.deleteJob(key);
        }
        return false;
    }
}
