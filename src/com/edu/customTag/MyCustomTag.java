package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
	
	private String color;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("시작태그를 만났음");
		System.out.println("color 속성값 : " + color );
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body 태그 처리 끝");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("끝태그 만났음");
		return SKIP_PAGE;
	}
	
}
