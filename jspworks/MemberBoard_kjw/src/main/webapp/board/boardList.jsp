<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~ </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<link rel="stylesheet" href="./resources/css/com.css">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div id="container">
		<div class="title">
			<h1>게시판</h1>
		</div>
		<div>
			<table class="tbl_list">
				<thead>
					<tr>
						<th>번호</th><th>제목</th><th>글쓴이</th><th>작성일</th><th>조회수</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${boardList}" var="board">
					<tr>
						<td><c:out value="${board.bnum}" /></td>
						<td><a href="./boardView.do?bnum=<c:out value="${board.bnum}" /> "> <c:out value="${board.title}" /></a></td>
						<td><c:out value="${board.memberId}" /></td>
						<td><fmt:formatDate value="${board.regDate}" 
						     pattern="yyyy-MM-dd hh:mm:ss"/></td>
						<td><c:out value="${board.hit}" /> </td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			<div class="btnWrite">
				<a href="./writeForm.do"><button type="button" style="padding:10px; border:#85586F; background:#AC7D88; color:#F8ECD1;">글쓰기</button></a>
			</div>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>