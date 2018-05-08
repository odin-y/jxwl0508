package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.exportProduct;
import cn.atxty.jxwl.dao.domain.exportProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface exportProductMapper {
    long countByExample(exportProductExample example);

    int deleteByExample(exportProductExample example);

    int deleteByPrimaryKey(String exportProductId);

    int insert(exportProduct record);

    int insertSelective(exportProduct record);

    List<exportProduct> selectByExample(exportProductExample example);

    exportProduct selectByPrimaryKey(String exportProductId);

    int updateByExampleSelective(@Param("record") exportProduct record, @Param("example") exportProductExample example);

    int updateByExample(@Param("record") exportProduct record, @Param("example") exportProductExample example);

    int updateByPrimaryKeySelective(exportProduct record);

    int updateByPrimaryKey(exportProduct record);
}