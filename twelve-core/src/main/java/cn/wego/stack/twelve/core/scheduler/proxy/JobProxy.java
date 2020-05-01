package cn.wego.stack.twelve.core.scheduler.proxy;


import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface JobProxy extends Job {

    void execute(JobExecutionContext context);
}
