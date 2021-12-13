<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<my:line/>
	<my:time/>
	<my:line/>
	<my:sum num1="12" num2="34"/>
	<my:line/>
	덧셈 결과 : ${result }
</body>
</html>

