<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sql insert 예제</title>
</head>
<body>
   <h2> 회원가입 </h2>
   <form action="./insertProcess.jsp" method="post">
   		<p>아이디: <input type="text" name="eid">
   		<p>비밀번호: <input type="text" name="passwd">
   		<p>이름: <input type="text" name="name">
		<p><input type="submit" value="등록">
   </form>
</body>
</html>