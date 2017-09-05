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
	 * 包装类型pojo绑定
	 * http://localhost:8080/SpringMVC30/hello/hello1.action?teacher.name=zhangsan，保证teacher.name中的teacher和包装pojo中的属性一致
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
	 * 数组绑定
	 * http://localhost:8080/SpringMVC30/hello/hello2.action?nums=1&nums=2，保证nums和数组名称一致
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
	 * List绑定（使用List接受页面提交的批量数据，可以通过包装类型pojo接受，在包装类型pojo中定义List属性，同理Map绑定类似）
	 * http://localhost:8080/SpringMVC30/hello/hello3.action?students[0].id=1&students[1].id=2，students对应包装类型pojo中的List类型的属性名，[0]对应下标，下标从0开始，id对应了包装类型pojo中List类型的属性中的pojo属性名
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
