package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.packinglist;
import cn.atxty.jxwl.dao.domain.packinglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface packinglistMapper {
    long countByExample(packinglistExample example);

    int deleteByExample(packinglistExample example);

    int deleteByPrimaryKey(String packingListId);

    int insert(packinglist record);

    int insertSelective(packinglist record);

    List<packinglist> selectByExample(packinglistExample example);

    packinglist selectByPrimaryKey(String packingListId);

    int updateByExampleSelective(@Param("record") packinglist record, @Param("example") packinglistExample example);

    int updateByExample(@Param("record") packinglist record, @Param("example") packinglistExample example);

    int updateByPrimaryKeySelective(packinglist record);

    int updateByPrimaryKey(packinglist record);
}