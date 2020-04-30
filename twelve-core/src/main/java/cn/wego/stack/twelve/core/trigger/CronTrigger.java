package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.core.service.JobService;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Service
public class CronTrigger implements Trigger {

    @Autowired
    private JobService jobService;

    @Override
    public boolean addJob(Job job) {
        jobService.addJob(job);
        return false;
    }

    @Override
    public boolean updateJob(Job job) {
        return false;
    }

    @Override
    public boolean removeJob(Job job) {
        return false;
    }
}
