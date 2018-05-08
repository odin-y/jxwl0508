package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ExtEproduct;

public interface ExtEproductMapper {

    int deleteByPrimaryKey(String extEproductId);

    int insert(ExtEproduct record);

    int insertSelective(ExtEproduct record);

    ExtEproduct selectByPrimaryKey(String extEproductId);

    int updateByPrimaryKeySelective(ExtEproduct record);

    int updateByPrimaryKey(ExtEproduct record);
}