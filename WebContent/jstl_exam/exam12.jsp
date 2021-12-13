<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="balance" value="1234.56789"/>

<fmt:formatNumber type="currency" 	value="${balance }"/><br/>
<fmt:formatNumber type="number" 	maxIntegerDigits="3" 	value="${balance }"/><br/>
<fmt:formatNumber type="number" 	maxFractionDigits="3" 	value="${balance }"/><br/>
<fmt:formatNumber type="number" 	groupingUsed="false"	value="${balance }"/><br/>
<fmt:formatNumber type="percent" 	maxIntegerDigits="3" 	value="${balance }"/><br/>
<fmt:formatNumber type="percent" 	minFractionDigits="10" 	value="${balance }"/><br/>
<fmt:formatNumber type="percent" 	maxIntegerDigits="3" 	value="${balance }"/><br/>
<fmt:formatNumber type="number" 	pattern="###.###E0" 	value="${balance }"/>

<hr>
<p>Currency in USA : </p>

<fmt:setLocale value="en_US"/>
<fmt:formatNumber type="currency" 	value="${balance }"/><br/>

<hr>
<fmt:parseNumber value="1,234,56" pattern="0,000.000" var="num1"/>
<fmt:parseNumber value="123" var="num2"/>

${num1 + num2}

