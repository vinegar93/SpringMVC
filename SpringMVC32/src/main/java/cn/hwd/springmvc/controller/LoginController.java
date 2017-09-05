package cn.hwd.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hwd.springmvc.bean.User;
import cn.hwd.springmvc.controller.validation.ValidationGroup;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/index.action")  
    public String index() throws Exception {
        return "index";  
    }
	
	/**
	 * 在需要校验的pojo前面添加@Validated
	 * 在需要校验的pojo后面添加BindingResult bindingResult接收校验出错信息
	 * 注意：@Validated和BindingResult bindingResult是配对出现的、顺序也是固定的（一前一后），value={ValidationGroup.class}表示指定使用ValidationGroup分组的校验
	 * @param model
	 * @param user
	 * @param bindingResult
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/home.action")  
    public String home(Model model, 
    		@Validated(value={ValidationGroup.class}) User user, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError : allErrors) {
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("user", user);
			return "index";
		}
        return "home";
    } 
	
}
