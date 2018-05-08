package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.HomePackingList;
import cn.atxty.jxwl.domain.HomePackingListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomePackingListMapper {
    long countByExample(HomePackingListExample example);

    int deleteByExample(HomePackingListExample example);

    int deleteByPrimaryKey(String homePackingListId);

    int insert(HomePackingList record);

    int insertSelective(HomePackingList record);

    List<HomePackingList> selectByExample(HomePackingListExample example);

    HomePackingList selectByPrimaryKey(String homePackingListId);

    int updateByExampleSelective(@Param("record") HomePackingList record, @Param("example") HomePackingListExample example);

    int updateByExample(@Param("record") HomePackingList record, @Param("example") HomePackingListExample example);

    int updateByPrimaryKeySelective(HomePackingList record);

    int updateByPrimaryKey(HomePackingList record);
}