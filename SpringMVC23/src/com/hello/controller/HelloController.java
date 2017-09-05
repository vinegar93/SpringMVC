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

	//��SpringMVC�У�����ҳ���ύ��������ͨ�������β������յģ���������controller�ඨ���Ա�������ܵ�
	//Ĭ�ϰ󶨷�ʽ��ҳ���ύ�����ݰ���request����
	@RequestMapping("/hello1.action")
	public String hello1(Model model, HttpServletRequest request) throws Exception {

		String id = request.getParameter("id");
		model.addAttribute("message", id);
		return "hello";
	}
	
	//�����������Ͱ󶨷�ʽ��ҳ���ύ�����ݰ����β�helloid��
	@RequestMapping("/hello2.action")
	public String hello2(Model model, @RequestParam(value="id", required=true, defaultValue="7") Integer helloid) throws Exception {
	
		model.addAttribute("message", helloid);
		return "hello";
	}
	
	//pojo�󶨷�ʽ��ҳ���ύ�����ݰ����β�user�����У�����ҳ���ύ���������ƺ�user���������������ͬ
	@RequestMapping("/hello3.action")
	public String hello3(Model model, User user) throws Exception {
	
		Integer id = user.getId();
		//String name = user.getName();
		//Date birth = user.getBirth();
		model.addAttribute("message", id);
		return "hello";
	}
}
