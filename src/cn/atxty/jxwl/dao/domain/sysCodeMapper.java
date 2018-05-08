package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.sysCode;
import cn.atxty.jxwl.dao.domain.sysCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysCodeMapper {
    long countByExample(sysCodeExample example);

    int deleteByExample(sysCodeExample example);

    int deleteByPrimaryKey(String sysCodeId);

    int insert(sysCode record);

    int insertSelective(sysCode record);

    List<sysCode> selectByExample(sysCodeExample example);

    sysCode selectByPrimaryKey(String sysCodeId);

    int updateByExampleSelective(@Param("record") sysCode record, @Param("example") sysCodeExample example);

    int updateByExample(@Param("record") sysCode record, @Param("example") sysCodeExample example);

    int updateByPrimaryKeySelective(sysCode record);

    int updateByPrimaryKey(sysCode record);
}