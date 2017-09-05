package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.action")//实现url和方法的映射
	public ModelAndView hello() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		//相当于request的setAttribute方法
		modelAndView.addObject("message", "Hello World");
		//指定视图
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
