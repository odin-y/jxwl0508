package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ExportProduct;

public interface ExportProductMapper {

    int deleteByPrimaryKey(String exportProductId);

    int insert(ExportProduct record);

    int insertSelective(ExportProduct record);

    ExportProduct selectByPrimaryKey(String exportProductId);

    int updateByPrimaryKeySelective(ExportProduct record);

    int updateByPrimaryKey(ExportProduct record);
}