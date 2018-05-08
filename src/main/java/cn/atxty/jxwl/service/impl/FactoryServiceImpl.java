package cn.atxty.jxwl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.atxty.jxwl.dao.FactoryMapper;
import cn.atxty.jxwl.domain.Factory;
import cn.atxty.jxwl.service.FactoryService;

@Service("factoryService")
public class FactoryServiceImpl implements FactoryService{
    @Resource
	private FactoryMapper factoryMapper;
	public List<Factory> findAllFactory() {
		
		return factoryMapper.findAllFactory();
	}

}
