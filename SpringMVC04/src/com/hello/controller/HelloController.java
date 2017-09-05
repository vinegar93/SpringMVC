package com.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		//�൱��request��setAttribute����
		modelAndView.addObject("message", "Hello World");
		//ָ����ͼ
		modelAndView.setViewName("/WEB-INF/page/hello.jsp");
		return modelAndView;
	}
}
