<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 처리</title>
</head>
<body>
	<jsp:include page="./menu.jsp" />
	<div id="container">
		<section id="role">
			<div class="title">
				<h2>Access Denied Page</h2>
			</div>
			
			<div>
				<h2><c:out value="${msg}" /></h2>
			</div>
		</section>
	</div>
	<jsp:include page="./footer.jsp" />
</body>
</html>