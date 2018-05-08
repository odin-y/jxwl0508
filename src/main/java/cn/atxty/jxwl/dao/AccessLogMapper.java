package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.AccessLog;

public interface AccessLogMapper {
   
    int deleteByPrimaryKey(String accessLogId);

    int insert(AccessLog record);

    int insertSelective(AccessLog record);


    AccessLog selectByPrimaryKey(String accessLogId);

  
    int updateByPrimaryKeySelective(AccessLog record);

    int updateByPrimaryKey(AccessLog record);
}