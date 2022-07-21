<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProcess.jsp" method="post">
		<label for="userid">아이디 :</label>
		<input type="text" id="userid" name="userid"><br>
		<label for="passwd">비밀번호 :</label>
		<input type="password" id="passwd" name="passwd"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>