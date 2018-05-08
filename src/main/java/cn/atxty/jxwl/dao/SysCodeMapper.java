package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.SysCode;

public interface SysCodeMapper {

    int deleteByPrimaryKey(String sysCodeId);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    SysCode selectByPrimaryKey(String sysCodeId);

   int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}