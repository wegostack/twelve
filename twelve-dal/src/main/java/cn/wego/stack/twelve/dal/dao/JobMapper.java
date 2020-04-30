package cn.wego.stack.twelve.dal.dao;

import cn.wego.stack.twelve.dal.pojo.Job;
import cn.wego.stack.twelve.dal.pojo.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);
}