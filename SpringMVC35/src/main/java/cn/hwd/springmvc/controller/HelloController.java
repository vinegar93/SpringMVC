package cn.hwd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hwd.springmvc.exception.HelloException;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/index.action")  
    public String index(Model model, String name) throws Exception {
		if(name == null){
			throw new HelloException("用户名不能为空");
		}
		model.addAttribute("message", name);
        return "index";  
    }
	
}
