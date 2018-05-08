package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Contract;
import cn.atxty.jxwl.domain.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractMapper {
    long countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}