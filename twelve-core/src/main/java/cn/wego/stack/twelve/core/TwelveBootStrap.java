package cn.wego.stack.twelve.core;

import cn.wego.stack.twelve.core.common.exception.TwelveException;
import cn.wego.stack.twelve.core.listener.TwelveRunListeners;
import cn.wego.stack.twelve.core.scheduler.CronScheduler;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TwelveBootStrap {
    private ConfigurableEnvironment environment;

    /**
     * Running twelve server, join cluster and start to scheduler job.
     *
     * @param environment
     */
    public void run(ConfigurableEnvironment environment) {
        try {
            TwelveRunListeners listeners = getTwelveRunListeners();
            listeners.starting();

            // init scheduler
            initScheduler();
            listeners.schedulerInitFinished();

            // join cluster
            joinCluster(listeners);

            // init
            listeners.fininshed();
        } catch (Throwable t) {
            throw new TwelveException(t);
        }
    }


    private void initScheduler() throws Exception {
        CronScheduler scheduler = new CronScheduler();
        scheduler.init();
        Job job = new Job();
        job.setId(1);
        job.setCron("0/1 * * * * ?");
        scheduler.scheduleJob(job);
    }

    private TwelveRunListeners getTwelveRunListeners() {
        return new TwelveRunListeners();
    }

    private void joinCluster(TwelveRunListeners listeners) {
        // todo
    }

    public void setEnvironment(ConfigurableEnvironment environment) {
        this.environment = environment;
    }
}
