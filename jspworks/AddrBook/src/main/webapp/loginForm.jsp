<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/addrbook.css">
<style>
</style>
</head>
<body>
   <div id="container">
      <h2>로그인</h2>
      <hr>
      <form action="./loginProcess.jsp" method="post">
         <table id="tbl">
            <tr>
               <td>이메일</td>
               <td><input type="text" name="email" maxlength=30 size=30></td>
            </tr>
            <tr>
               <td colspan="2">
                  <input type="submit" value="로그인">
                  <input type="reset" value="취소">
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>