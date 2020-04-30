package cn.wego.stack.twelve.core.service;

import cn.wego.stack.twelve.dal.dao.JobMapper;
import cn.wego.stack.twelve.dal.pojo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Component
public class JobService {

    @Autowired
    private JobMapper jobMapper;

    public boolean addJob(Job job) {
        return jobMapper.insert(job) > 0 ? true : false;
    }
}
