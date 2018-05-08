package factoryTest;



import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.atxty.jxwl.domain.Factory;
import cn.atxty.jxwl.service.FactoryService;



public class factory {

	@Test
	public void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		FactoryService fin=(FactoryService) ctx.getBean("factoryService");
		List<Factory> factory=fin.findAllFactory();
		System.out.println("=====================");
		for(Factory fi:factory){
			System.out.println("======================"+fi.getFactoryName());
		}
	}

}
