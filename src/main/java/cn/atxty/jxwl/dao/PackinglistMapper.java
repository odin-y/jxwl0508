package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Packinglist;


public interface PackinglistMapper {

    int deleteByPrimaryKey(String packingListId);

    int insert(Packinglist record);

    int insertSelective(Packinglist record);

    Packinglist selectByPrimaryKey(String packingListId);

    int updateByPrimaryKeySelective(Packinglist record);

    int updateByPrimaryKey(Packinglist record);
}