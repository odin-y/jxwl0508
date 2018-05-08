package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ContractProduct;

public interface ContractProductMapper {
    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProduct record);

    int insertSelective(ContractProduct record);
    
    ContractProduct selectByPrimaryKey(String contractProductId);

    int updateByPrimaryKeySelective(ContractProduct record);

    int updateByPrimaryKey(ContractProduct record);
}