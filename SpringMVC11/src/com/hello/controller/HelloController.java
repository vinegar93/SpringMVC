package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.action")//ʵ��url�ͷ�����ӳ��
	public ModelAndView hello() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		//�൱��request��setAttribute����
		modelAndView.addObject("message", "Hello World");
		//ָ����ͼ
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
