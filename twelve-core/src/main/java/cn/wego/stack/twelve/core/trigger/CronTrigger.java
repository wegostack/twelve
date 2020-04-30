package cn.wego.stack.twelve.core.trigger;

import cn.wego.stack.twelve.twelve.dal.dao.JobDAO;
import cn.wego.stack.twelve.twelve.dal.dataobject.JobDO;
import cn.wego.stack.twelve.twelve.model.Job;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Service
public class CronTrigger implements Trigger {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public boolean addJob(Job job) {
        JobDO jobDO = new JobDO();
        job.setId(1L);
        BeanUtils.copyProperties(job, jobDO);
        jobDAO.addJob(jobDO);
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
