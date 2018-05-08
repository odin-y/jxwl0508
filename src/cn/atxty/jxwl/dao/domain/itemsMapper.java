package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.items;
import cn.atxty.jxwl.dao.domain.itemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface itemsMapper {
    long countByExample(itemsExample example);

    int deleteByExample(itemsExample example);

    int deleteByPrimaryKey(String itemsId);

    int insert(items record);

    int insertSelective(items record);

    List<items> selectByExample(itemsExample example);

    items selectByPrimaryKey(String itemsId);

    int updateByExampleSelective(@Param("record") items record, @Param("example") itemsExample example);

    int updateByExample(@Param("record") items record, @Param("example") itemsExample example);

    int updateByPrimaryKeySelective(items record);

    int updateByPrimaryKey(items record);
}