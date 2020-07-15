package cn.wego.stack.twelve.dal.dao;

import cn.wego.stack.twelve.dal.pojo.TriggerRecord;
import cn.wego.stack.twelve.dal.pojo.TriggerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggerRecordMapper {
    long countByExample(TriggerRecordExample example);

    int deleteByExample(TriggerRecordExample example);

    int insert(TriggerRecord record);

    int insertSelective(TriggerRecord record);

    List<TriggerRecord> selectByExample(TriggerRecordExample example);

    int updateByExampleSelective(@Param("record") TriggerRecord record, @Param("example") TriggerRecordExample example);

    int updateByExample(@Param("record") TriggerRecord record, @Param("example") TriggerRecordExample example);
}