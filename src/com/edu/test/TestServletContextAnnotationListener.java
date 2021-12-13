package com.edu.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextAnnotationListener implements ServletContextListener {
	
	public TestServletContextAnnotationListener() {
		System.out.println("TestServletContextAnnotationListener 객체 생성");
	}
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 초기화");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext 객체 해제");
	}
}


