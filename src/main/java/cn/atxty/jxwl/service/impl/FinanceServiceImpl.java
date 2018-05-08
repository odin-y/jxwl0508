package cn.atxty.jxwl.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import cn.atxty.jxwl.dao.FinanceMapper;
import cn.atxty.jxwl.domain.Finance;
import cn.atxty.jxwl.service.FinanceService;

@Service("financeService")
public class FinanceServiceImpl implements FinanceService{
	
	 @Resource
     private FinanceMapper FinanceMapper;

	public List<Finance> findAll() {
		
		return FinanceMapper.findAll();
	}

}
