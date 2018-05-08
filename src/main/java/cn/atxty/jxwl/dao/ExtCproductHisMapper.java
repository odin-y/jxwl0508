package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ExtCproductHis;

public interface ExtCproductHisMapper {

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproductHis record);

    int insertSelective(ExtCproductHis record);

    ExtCproductHis selectByPrimaryKey(String extCproductId);

 
    int updateByPrimaryKeySelective(ExtCproductHis record);

    int updateByPrimaryKey(ExtCproductHis record);
}