package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ContractHis;


public interface ContractHisMapper {
 
    int deleteByPrimaryKey(String contractId);

    int insert(ContractHis record);

    int insertSelective(ContractHis record);

    ContractHis selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(ContractHis record);

    int updateByPrimaryKey(ContractHis record);
}