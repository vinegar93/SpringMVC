package cn.hwd.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ������������ʵ��HandlerInterceptor�ӿ�
 * @author huangwending
 *
 */
public class BHandlerInterceptor implements HandlerInterceptor {

	/**
	 * Handler�������֮��ִ�У����ڴ����쳣����־�ȡ�
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("BHandlerInterceptor afterCompletion");
	}

	/**
	 * ����Handler����֮�󡢷���ModelAndView֮ǰִ�У����ڴ���ģ�����ݡ���ͼ�ȡ�
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("BHandlerInterceptor postHandle");
	}

	/**
	 * ����Handler����֮ǰִ�У����������֤�������Ȩ�ȡ�
	 * return false��ʾ���أ�return true��ʾ���С�
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		System.out.println("BHandlerInterceptor preHandle");
		return true;
	}

}
