<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h3>회원가입</h3>
	<form action="memberProc.jsp" method="POST">
		<ul>
			<li>
				<label for="id">ID:</label>
				<input type="text" name="id"/>
			</li>
			<li>
				<label for="pwd">PASSWORD:</label>
				<input type="password" name="pwd"/>
			</li>
			
		</ul>
		<input type="submit" value="가입"/>
	</form>
</body>
</html>

