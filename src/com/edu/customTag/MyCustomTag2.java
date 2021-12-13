package com.edu.customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomTag2 extends SimpleTagSupport {

	@Override 
	public void doTag() throws JspException, IOException {
		System.out.println("커스텀 태그 바디 실행 전");
		getJspBody().invoke(null);
		System.out.println("커스텀 태그 바디 실행 후");
	}	
}


