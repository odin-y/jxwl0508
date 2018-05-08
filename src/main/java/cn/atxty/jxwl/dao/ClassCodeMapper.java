package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ClassCode;

public interface ClassCodeMapper {

   
    int deleteByPrimaryKey(String classCodeId);

    int insert(ClassCode record);

    int insertSelective(ClassCode record);


    ClassCode selectByPrimaryKey(String classCodeId);

    int updateByPrimaryKeySelective(ClassCode record);

    int updateByPrimaryKey(ClassCode record);
}