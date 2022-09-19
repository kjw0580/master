<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<link rel="stylesheet" href="/resources/css/font.css">
<link rel="stylesheet" href="/resources/css/style.css">
<style type="text/css">
#container{background-image: linear-gradient(to bottom, #ffffff, #f7f7f7, #f0eeef, #e8e6e7, #e1dede);}
.multiple-box-shadows { text-shadow: 0 0 20px #1a70dc;} 
</style>
</head>
<body>
   <jsp:include page="../menu.jsp" />
   <div id="container">
      <section id="list">
         <div class="title">
            <!-- <h2 style="color: white;">회원 목록</h2> -->
            <h2 class="multiple-box-shadows">회원 목록</h2>
         </div>
            <table class="tbl_ml ">
               <thead>
                  <tr>
                     <th>번호</th>
                     <th>아이디</th>
                     <!-- <th>비밀번호</th> -->
                     <th>이름</th>
                     <th>가입일</th>
                     <th>이메일</th>
                  </tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${memberList}" var="member" varStatus="status">
                   <tr>
                      <td><c:out value="${status.count}"/></td>
                      <td><b><a style="color:#1a70dc; text-decoration: none;" href="/member/memberView?userid=<c:out value="${member.userid}" />"><c:out value="${member.userid}" /></a></b></td>
                      <%-- <td><c:out value="${member.userpw}" /></td> --%>
                      <td><c:out value="${member.username}" /></td>
                      <td><fmt:formatDate value="${member.regdate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                      <td><c:out value="${member.email}" /></td>
                   </tr>
                   </c:forEach>
                  </tbody>
            </table>
      </section>
   </div>
   <jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>