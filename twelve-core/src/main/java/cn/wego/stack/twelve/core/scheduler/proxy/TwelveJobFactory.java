package cn.wego.stack.twelve.core.scheduler.proxy;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.spi.JobFactory;
import org.quartz.spi.TriggerFiredBundle;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TwelveJobFactory implements JobFactory {

    @Override
    public Job newJob(TriggerFiredBundle triggerFiredBundle,
                      Scheduler scheduler) throws SchedulerException {
        String name = triggerFiredBundle.getJobDetail().getKey().getName();
        return new DefaultJobProxy();
    }
}
