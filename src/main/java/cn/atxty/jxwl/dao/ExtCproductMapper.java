package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ExtCproduct;

public interface ExtCproductMapper {

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproduct record);

    int insertSelective(ExtCproduct record);

    ExtCproduct selectByPrimaryKey(String extCproductId);

    int updateByPrimaryKeySelective(ExtCproduct record);

    int updateByPrimaryKey(ExtCproduct record);
}