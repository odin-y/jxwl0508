package cn.atxty.jxwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/index")
public class index {
	
	@RequestMapping(value="/index.action",method=RequestMethod.GET)
	public String indexs(){
		System.out.println("=============测试框架===============");
		return "MyJsp.jsp";
	}
}
