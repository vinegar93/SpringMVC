package cn.hwd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hwd.springmvc.bean.Item;

@Controller
@RequestMapping("/json")
public class JsonController {
	
	@RequestMapping("/index.action")  
    public String index() throws Exception {
        return "index";  
    }
	
	/**
	 * @RequestBod����ʾ��json��ת����item����
	 * @ResponseBody����ʾ��item����ת����json��
	 * @param item
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/requestJson.action")  
    public @ResponseBody Item requestJson(@RequestBody Item item) throws Exception {
        return item;  
    }
	
	@RequestMapping("/responseJson.action")  
    public @ResponseBody Item responseJson(Item item) throws Exception {
        return item;  
    }
	
}
