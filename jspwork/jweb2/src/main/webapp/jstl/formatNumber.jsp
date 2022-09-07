<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>숫자, 통화를 다양한 형식으로 표기</h2>
	<p>숫자: <fmt:formatNumber value="3200100" /> <!-- 천단위 구분기호 표시 -->
	<p><fmt:formatNumber value="3200100" type="number"/>
	<p><fmt:formatNumber value="3200100" groupingUsed="false"/>
	<p><fmt:formatNumber value="3200100" groupingUsed="true"/>
	<!-- pattern 속성 : #,##0.00 : 0은 0으로 채움 -->
	<p><fmt:formatNumber value="3200100" pattern="#,##0.00"/>
	<p>통화 : <fmt:formatNumber value="3200100" type="currency"/>
	<p><fmt:formatNumber value="3200100" type="currency" currencySymbol="\\"/>
	<p>퍼센트 : <fmt:formatNumber value="0.25" type="percent"/>
</body>
</html>