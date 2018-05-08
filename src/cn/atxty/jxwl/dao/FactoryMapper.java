package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Factory;
import cn.atxty.jxwl.domain.FactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryMapper {
    long countByExample(FactoryExample example);

    int deleteByExample(FactoryExample example);

    int deleteByPrimaryKey(String factoryId);

    int insert(Factory record);

    int insertSelective(Factory record);

    List<Factory> selectByExampleWithBLOBs(FactoryExample example);

    List<Factory> selectByExample(FactoryExample example);

    Factory selectByPrimaryKey(String factoryId);

    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKeyWithBLOBs(Factory record);

    int updateByPrimaryKey(Factory record);
}