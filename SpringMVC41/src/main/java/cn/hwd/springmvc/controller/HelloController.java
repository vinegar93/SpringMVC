package cn.hwd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hwd.springmvc.bean.Item;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	/**
	 * /index/{id}/{name}/{price}中的{id}表示将这个位置的参数传送到@PathVariable("id")指定的变量之中，{name}和{price}类似
	 * @param id
	 * @param name
	 * @param price
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index/{id}/{name}/{price}")  
    public @ResponseBody Item index(@PathVariable("id") Integer id, 
    		@PathVariable("name") String name, @PathVariable("price") double price) throws Exception {
        return new Item(id, name, price);  
    }
	
}
