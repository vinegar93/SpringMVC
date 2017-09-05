package com.hello.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.HttpRequestHandler;

public class HelloController implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//����ģ������
		request.setAttribute("message", "Hello World");
		//����ת������ͼ
		request.getRequestDispatcher("/WEB-INF/page/hello.jsp").forward(request, response);
	}
}
