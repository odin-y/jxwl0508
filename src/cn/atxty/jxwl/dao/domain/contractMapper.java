package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.contract;
import cn.atxty.jxwl.dao.domain.contractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface contractMapper {
    long countByExample(contractExample example);

    int deleteByExample(contractExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(contract record);

    int insertSelective(contract record);

    List<contract> selectByExample(contractExample example);

    contract selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") contract record, @Param("example") contractExample example);

    int updateByExample(@Param("record") contract record, @Param("example") contractExample example);

    int updateByPrimaryKeySelective(contract record);

    int updateByPrimaryKey(contract record);
}