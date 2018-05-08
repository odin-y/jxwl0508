package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.export;
import cn.atxty.jxwl.dao.domain.exportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface exportMapper {
    long countByExample(exportExample example);

    int deleteByExample(exportExample example);

    int deleteByPrimaryKey(String exportId);

    int insert(export record);

    int insertSelective(export record);

    List<export> selectByExample(exportExample example);

    export selectByPrimaryKey(String exportId);

    int updateByExampleSelective(@Param("record") export record, @Param("example") exportExample example);

    int updateByExample(@Param("record") export record, @Param("example") exportExample example);

    int updateByPrimaryKeySelective(export record);

    int updateByPrimaryKey(export record);
}