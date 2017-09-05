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
	 * ����ҪУ���pojoǰ�����@Validated
	 * ����ҪУ���pojo�������BindingResult bindingResult����У�������Ϣ
	 * ע�⣺@Validated��BindingResult bindingResult����Գ��ֵġ�˳��Ҳ�ǹ̶��ģ�һǰһ�󣩣�value={ValidationGroup.class}��ʾָ��ʹ��ValidationGroup�����У��
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
