package cn.wego.stack.twelve.twelve.dal.dao;

import cn.wego.stack.twelve.twelve.dal.dataobject.JobDO;
import org.springframework.stereotype.Component;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Component
public class JobDAO {

    public void addJob(JobDO jobDO) {
        System.out.println("-------"+ jobDO.getApp());
    }
}
