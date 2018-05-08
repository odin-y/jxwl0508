package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.TextCode;
public interface TextCodeMapper {

    int deleteByPrimaryKey(String textCodeId);

    int insert(TextCode record);

    int insertSelective(TextCode record);

    TextCode selectByPrimaryKey(String textCodeId);

    int updateByPrimaryKeySelective(TextCode record);

    int updateByPrimaryKey(TextCode record);
}