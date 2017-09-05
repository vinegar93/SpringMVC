package com.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/hello1.action")
	public ModelAndView hello1() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello1");
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
	@RequestMapping("/hello2.action")
	public String hello2(Model model) throws Exception {
		
		model.addAttribute("message", "Hello2");
		return "hello";//�����߼���ͼ��
	}
	
	@RequestMapping("/hello3.action")
	public String hello3() throws Exception {
		
		return "redirect:hello1.action";//�ض���request�����Թ���
	}
	
	@RequestMapping("/hello4.action")
	public String hello4() throws Exception {
		
		return "forward:hello1.action";//ת����request���Թ���
	}
	
	@RequestMapping("/hello5.action")
	public void hello5(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.sendRedirect("hello1.action");//�ض���
	}
	
	@RequestMapping("/hello6.action")
	public void hello6(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.getRequestDispatcher("hello1.action").forward(request, response);//ת��
	}
	
	@RequestMapping("/hello7.action")
	public void hello7(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json��");
	}
}

