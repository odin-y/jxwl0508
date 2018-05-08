package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Items;

public interface ItemsMapper {

    int deleteByPrimaryKey(String itemsId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(String itemsId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}