package com.ai.paas.cpaas.be.am.dao.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ai.paas.cpaas.be.am.dao.mapper.bo.AppTaskLog;
import com.ai.paas.cpaas.be.am.dao.mapper.bo.AppTaskLogCriteria;

public interface AppTaskLogMapper {
    int countByExample(AppTaskLogCriteria example);

    int deleteByExample(AppTaskLogCriteria example);

    int deleteByPrimaryKey(Long logId);

    int insert(AppTaskLog record);

    int insertSelective(AppTaskLog record);

    List<AppTaskLog> selectByExample(AppTaskLogCriteria example);

    AppTaskLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") AppTaskLog record, @Param("example") AppTaskLogCriteria example);

    int updateByExample(@Param("record") AppTaskLog record, @Param("example") AppTaskLogCriteria example);

    int updateByPrimaryKeySelective(AppTaskLog record);

    int updateByPrimaryKey(AppTaskLog record);
}