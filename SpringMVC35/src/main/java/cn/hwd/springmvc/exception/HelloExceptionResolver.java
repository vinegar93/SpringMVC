package cn.hwd.springmvc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * ����ȫ���쳣��������ʵ��springmvc�ṩ��HandlerExceptionResolver�ӿڣ�
 * @author huangwending
 *
 */
public class HelloExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		HelloException helloException = null;
		if(ex instanceof HelloException){
			helloException = (HelloException)ex;
		}else{
			helloException = new HelloException("δ֪����");
		}
		String message = helloException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
