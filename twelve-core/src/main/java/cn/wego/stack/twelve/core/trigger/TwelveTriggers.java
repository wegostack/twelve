package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.dal.pojo.Job;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TwelveTriggers {

    private static final Map<String, IJobTrigger> triggerMap = Maps.newHashMap();

    public static void init() throws Exception {
        CronTrigger cronTrigger = new CronTrigger();
        triggerMap.put("cron", cronTrigger);
        cronTrigger.init();

        TimingTrigger timingTrigger = new TimingTrigger();
        triggerMap.put("timing", timingTrigger);
        timingTrigger.init();
    }

    public static boolean scheduleJob(Job job) throws Exception {
        IJobTrigger jobTrigger = triggerMap.get("cron");
        return jobTrigger.scheduleJob(job);
    }

    public static boolean refreshJob(Job job) throws Exception {
        IJobTrigger jobTrigger = triggerMap.get("cron");
        return jobTrigger.refreshJob(job);
    }

    public static boolean removeJob(Job job) throws Exception {
        IJobTrigger jobTrigger = triggerMap.get("cron");
        return jobTrigger.removeJob(job);
    }
}
