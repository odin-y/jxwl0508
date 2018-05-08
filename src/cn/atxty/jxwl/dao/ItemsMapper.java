package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Items;
import cn.atxty.jxwl.domain.ItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapper {
    long countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    int deleteByPrimaryKey(String itemsId);

    int insert(Items record);

    int insertSelective(Items record);

    List<Items> selectByExample(ItemsExample example);

    Items selectByPrimaryKey(String itemsId);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}