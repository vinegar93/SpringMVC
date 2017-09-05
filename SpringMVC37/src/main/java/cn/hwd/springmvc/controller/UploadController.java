package cn.hwd.springmvc.controller;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("/index.action")  
    public String index() throws Exception {
        return "index";  
    }
	
	@RequestMapping("/upload.action")  
    public String upload(Model model, @RequestParam MultipartFile file) throws Exception {
		if(file != null) {
			String path = "D:\\workspace\\upload\\";
			String originalFilename = file.getOriginalFilename();
			String newFilename = UUID.randomUUID() + 
					originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile = new File(path + newFilename);
			//将内存中的数据写入磁盘
			file.transferTo(newFile);
			model.addAttribute("newFilename", newFilename);
			return "success";
		}else{
			return "index";
		} 
    }
	
}
