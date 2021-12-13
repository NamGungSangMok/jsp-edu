package com.edu.test;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class TestSessionAttributeListener implements HttpSessionAttributeListener {
	
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributeListener 객체 생성");
	}
	
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("세션 객체에 속성 추가");
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("세션 객체의 속성 삭제");
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("세션 객체의 속성 변경");
	}

}
