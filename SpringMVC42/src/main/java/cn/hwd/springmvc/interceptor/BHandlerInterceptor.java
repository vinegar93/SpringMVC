package cn.hwd.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义拦截器并实现HandlerInterceptor接口
 * @author huangwending
 *
 */
public class BHandlerInterceptor implements HandlerInterceptor {

	/**
	 * Handler方法完成之后执行，用于处理异常、日志等。
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("BHandlerInterceptor afterCompletion");
	}

	/**
	 * 进入Handler方法之后、返回ModelAndView之前执行，用于处理模型数据、视图等。
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("BHandlerInterceptor postHandle");
	}

	/**
	 * 进入Handler方法之前执行，用于身份认证、身份授权等。
	 * return false表示拦截，return true表示放行。
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		System.out.println("BHandlerInterceptor preHandle");
		return true;
	}

}
