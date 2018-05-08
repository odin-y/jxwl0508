package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ContractProductHis;


public interface ContractProductHisMapper {

    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProductHis record);

    int insertSelective(ContractProductHis record);

    ContractProductHis selectByPrimaryKey(String contractProductId);

    int updateByPrimaryKeySelective(ContractProductHis record);

    int updateByPrimaryKey(ContractProductHis record);
}