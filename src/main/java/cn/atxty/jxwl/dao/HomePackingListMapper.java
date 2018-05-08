package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.HomePackingList;

public interface HomePackingListMapper {

    int deleteByPrimaryKey(String homePackingListId);

    int insert(HomePackingList record);

    int insertSelective(HomePackingList record);


    HomePackingList selectByPrimaryKey(String homePackingListId);

    int updateByPrimaryKeySelective(HomePackingList record);

    int updateByPrimaryKey(HomePackingList record);
}