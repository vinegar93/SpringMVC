package com.hello.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.bean.User;

@Controller
@RequestMapping("/hello")
public class HelloController {

	//在SpringMVC中，接收页面提交的数据是通过方法形参来接收的，而不是在controller类定义成员变量接受的
	//默认绑定方式，页面提交的数据绑定在request域中
	@RequestMapping("/hello1.action")
	public String hello1(Model model, HttpServletRequest request) throws Exception {

		String id = request.getParameter("id");
		model.addAttribute("message", id);
		return "hello";
	}
	
	//基本数据类型绑定方式，页面提交的数据绑定在形参helloid中
	@RequestMapping("/hello2.action")
	public String hello2(Model model, @RequestParam(value="id", required=true, defaultValue="7") Integer helloid) throws Exception {
	
		model.addAttribute("message", helloid);
		return "hello";
	}
	
	//pojo绑定方式，页面提交的数据绑定在形参user对象中，其中页面提交的数据名称和user对象的属性名称相同
	@RequestMapping("/hello3.action")
	public String hello3(Model model, User user) throws Exception {
	
		Integer id = user.getId();
		//String name = user.getName();
		//Date birth = user.getBirth();
		model.addAttribute("message", id);
		return "hello";
	}
}
