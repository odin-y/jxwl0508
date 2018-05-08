package cn.atxty.jxwl.dao;

import java.util.List;

import cn.atxty.jxwl.domain.Factory;

public interface FactoryMapper {
	//查找全部
    List<Factory> findAllFactory();
    int deleteByPrimaryKey(String factoryId);

    int insert(Factory record);

    int insertSelective(Factory record);

    Factory selectByPrimaryKey(String factoryId);
    
   int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKeyWithBLOBs(Factory record);

    int updateByPrimaryKey(Factory record);
}