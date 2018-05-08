package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.extEproduct;
import cn.atxty.jxwl.dao.domain.extEproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface extEproductMapper {
    long countByExample(extEproductExample example);

    int deleteByExample(extEproductExample example);

    int deleteByPrimaryKey(String extEproductId);

    int insert(extEproduct record);

    int insertSelective(extEproduct record);

    List<extEproduct> selectByExample(extEproductExample example);

    extEproduct selectByPrimaryKey(String extEproductId);

    int updateByExampleSelective(@Param("record") extEproduct record, @Param("example") extEproductExample example);

    int updateByExample(@Param("record") extEproduct record, @Param("example") extEproductExample example);

    int updateByPrimaryKeySelective(extEproduct record);

    int updateByPrimaryKey(extEproduct record);
}