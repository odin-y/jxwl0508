package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.finance;
import cn.atxty.jxwl.dao.domain.financeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface financeMapper {
    long countByExample(financeExample example);

    int deleteByExample(financeExample example);

    int deleteByPrimaryKey(String financeId);

    int insert(finance record);

    int insertSelective(finance record);

    List<finance> selectByExample(financeExample example);

    finance selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") finance record, @Param("example") financeExample example);

    int updateByExample(@Param("record") finance record, @Param("example") financeExample example);

    int updateByPrimaryKeySelective(finance record);

    int updateByPrimaryKey(finance record);
}