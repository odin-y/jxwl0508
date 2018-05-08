package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.factory;
import cn.atxty.jxwl.dao.domain.factoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface factoryMapper {
    long countByExample(factoryExample example);

    int deleteByExample(factoryExample example);

    int deleteByPrimaryKey(String factoryId);

    int insert(factory record);

    int insertSelective(factory record);

    List<factory> selectByExampleWithBLOBs(factoryExample example);

    List<factory> selectByExample(factoryExample example);

    factory selectByPrimaryKey(String factoryId);

    int updateByExampleSelective(@Param("record") factory record, @Param("example") factoryExample example);

    int updateByExampleWithBLOBs(@Param("record") factory record, @Param("example") factoryExample example);

    int updateByExample(@Param("record") factory record, @Param("example") factoryExample example);

    int updateByPrimaryKeySelective(factory record);

    int updateByPrimaryKeyWithBLOBs(factory record);

    int updateByPrimaryKey(factory record);
}