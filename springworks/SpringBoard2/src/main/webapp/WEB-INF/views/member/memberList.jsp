<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div id="container">
		<section id="list">
			<div class="title">
				<h2>ȸ�� ����</h2>
			</div>
				<table class="tbl_list">
					<thead>
						<tr>						
							<th>��ȣ</th>
							<th>���̵�</th>
							<th>�� ��</th>
							<th>������</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${memberList}" var="member" varStatus="status">
							<tr>
								<td><c:out value="${status.count}"/></td>
								<td><a href="/member/memberView?userid=<c:out value="${member.userid}"/>"><c:out value="${member.userid}"/></a></td>
								<%-- <td><c:out value="${member.userpw}"/></td> --%>
								<td><c:out value="${member.username}"/></td>
								<td><fmt:formatDate value="${member.regDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>