package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.homePackingList;
import cn.atxty.jxwl.dao.domain.homePackingListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface homePackingListMapper {
    long countByExample(homePackingListExample example);

    int deleteByExample(homePackingListExample example);

    int deleteByPrimaryKey(String homePackingListId);

    int insert(homePackingList record);

    int insertSelective(homePackingList record);

    List<homePackingList> selectByExample(homePackingListExample example);

    homePackingList selectByPrimaryKey(String homePackingListId);

    int updateByExampleSelective(@Param("record") homePackingList record, @Param("example") homePackingListExample example);

    int updateByExample(@Param("record") homePackingList record, @Param("example") homePackingListExample example);

    int updateByPrimaryKeySelective(homePackingList record);

    int updateByPrimaryKey(homePackingList record);
}