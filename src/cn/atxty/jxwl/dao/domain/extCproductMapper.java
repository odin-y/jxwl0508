package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.extCproduct;
import cn.atxty.jxwl.dao.domain.extCproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface extCproductMapper {
    long countByExample(extCproductExample example);

    int deleteByExample(extCproductExample example);

    int deleteByPrimaryKey(String extCproductId);

    int insert(extCproduct record);

    int insertSelective(extCproduct record);

    List<extCproduct> selectByExample(extCproductExample example);

    extCproduct selectByPrimaryKey(String extCproductId);

    int updateByExampleSelective(@Param("record") extCproduct record, @Param("example") extCproductExample example);

    int updateByExample(@Param("record") extCproduct record, @Param("example") extCproductExample example);

    int updateByPrimaryKeySelective(extCproduct record);

    int updateByPrimaryKey(extCproduct record);
}