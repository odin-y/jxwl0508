package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Finance;
import cn.atxty.jxwl.domain.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {
    long countByExample(FinanceExample example);

    int deleteByExample(FinanceExample example);

    int deleteByPrimaryKey(String financeId);

    int insert(Finance record);

    int insertSelective(Finance record);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}