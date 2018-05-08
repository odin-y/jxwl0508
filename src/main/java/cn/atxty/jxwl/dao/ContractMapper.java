package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Contract;

public interface ContractMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(String contractId);



    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}