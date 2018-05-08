package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Export;

public interface ExportMapper {

    int deleteByPrimaryKey(String exportId);

    int insert(Export record);

    int insertSelective(Export record);

    Export selectByPrimaryKey(String exportId);
    
    int updateByPrimaryKeySelective(Export record);

    int updateByPrimaryKey(Export record);
}