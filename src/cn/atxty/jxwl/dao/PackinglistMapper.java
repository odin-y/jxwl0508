package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Packinglist;
import cn.atxty.jxwl.domain.PackinglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackinglistMapper {
    long countByExample(PackinglistExample example);

    int deleteByExample(PackinglistExample example);

    int deleteByPrimaryKey(String packingListId);

    int insert(Packinglist record);

    int insertSelective(Packinglist record);

    List<Packinglist> selectByExample(PackinglistExample example);

    Packinglist selectByPrimaryKey(String packingListId);

    int updateByExampleSelective(@Param("record") Packinglist record, @Param("example") PackinglistExample example);

    int updateByExample(@Param("record") Packinglist record, @Param("example") PackinglistExample example);

    int updateByPrimaryKeySelective(Packinglist record);

    int updateByPrimaryKey(Packinglist record);
}