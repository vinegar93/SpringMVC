package cn.hwd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/index.action")  
    public String index() throws Exception {
        return "index";  
    }
	
}
