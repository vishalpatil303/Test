package com.test.rts;

import java.io.InputStream;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ApplicationControlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		InputStream inputStream ;
		ServletContext context = config.getServletContext();
		String path = ApplicationConstant.CONFIG_XML_PATH;
		inputStream = context.getResourceAsStream(path);
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
