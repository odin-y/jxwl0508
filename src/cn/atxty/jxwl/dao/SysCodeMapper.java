package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.SysCode;
import cn.atxty.jxwl.domain.SysCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeMapper {
    long countByExample(SysCodeExample example);

    int deleteByExample(SysCodeExample example);

    int deleteByPrimaryKey(String sysCodeId);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    List<SysCode> selectByExample(SysCodeExample example);

    SysCode selectByPrimaryKey(String sysCodeId);

    int updateByExampleSelective(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByExample(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}