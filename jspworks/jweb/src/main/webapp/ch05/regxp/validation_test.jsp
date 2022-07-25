<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="test.process.jsp" method="post" name="Member">
		<p>아이디: <input type="text" name="id">
		<p>비밀번호: <input type="password" name="passwd">
		<p>이 름: <input type="text" name="name">
		<p> <button type="button" onclick="checkMember()">가입하기</button>
	</form>
</body>
</html>