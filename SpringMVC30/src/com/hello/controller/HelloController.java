package com.hello.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.bean.Course;
import com.user.bean.Student;

@Controller
@RequestMapping("/hello")
public class HelloController {

	/**
	 * ��װ����pojo��
	 * http://localhost:8080/SpringMVC30/hello/hello1.action?teacher.name=zhangsan����֤teacher.name�е�teacher�Ͱ�װpojo�е�����һ��
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hello1.action")
	public String hello1(Model model, Course course) throws Exception {
		
		model.addAttribute("message", course.getTeacher().getName());
		return "hello";
	}
	
	/**
	 * �����
	 * http://localhost:8080/SpringMVC30/hello/hello2.action?nums=1&nums=2����֤nums����������һ��
	 * @param model
	 * @param nums
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hello2.action")
	public String hello2(Model model, Integer[] nums) throws Exception {
		
		Integer sum = 0;
		for (Integer num : nums) {
			sum += num;
		}
		model.addAttribute("message", sum);
		return "hello";
	}
	
	/**
	 * List�󶨣�ʹ��List����ҳ���ύ���������ݣ�����ͨ����װ����pojo���ܣ��ڰ�װ����pojo�ж���List���ԣ�ͬ��Map�����ƣ�
	 * http://localhost:8080/SpringMVC30/hello/hello3.action?students[0].id=1&students[1].id=2��students��Ӧ��װ����pojo�е�List���͵���������[0]��Ӧ�±꣬�±��0��ʼ��id��Ӧ�˰�װ����pojo��List���͵������е�pojo������
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/hello3.action")
	public String hello3(Model model, Course course) throws Exception {
		
		Integer sum = 0;
		List<Student> students = course.getStudents();
		for (Student student : students) {
			if (student.getId() != null) {
				++sum;	
			}
		}
		model.addAttribute("message", sum);
		return "hello";
	}
}
