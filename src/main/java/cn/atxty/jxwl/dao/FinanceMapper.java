package cn.atxty.jxwl.dao;

import java.util.List;

import cn.atxty.jxwl.domain.Finance;

public interface FinanceMapper {
    List<Finance> findAll();
    int deleteByPrimaryKey(String financeId);

    int insert(Finance record);

    int insertSelective(Finance record);

    Finance selectByPrimaryKey(String financeId);
    
    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}