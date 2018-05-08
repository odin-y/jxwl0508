package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.contractProduct;
import cn.atxty.jxwl.dao.domain.contractProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface contractProductMapper {
    long countByExample(contractProductExample example);

    int deleteByExample(contractProductExample example);

    int deleteByPrimaryKey(String contractProductId);

    int insert(contractProduct record);

    int insertSelective(contractProduct record);

    List<contractProduct> selectByExample(contractProductExample example);

    contractProduct selectByPrimaryKey(String contractProductId);

    int updateByExampleSelective(@Param("record") contractProduct record, @Param("example") contractProductExample example);

    int updateByExample(@Param("record") contractProduct record, @Param("example") contractProductExample example);

    int updateByPrimaryKeySelective(contractProduct record);

    int updateByPrimaryKey(contractProduct record);
}