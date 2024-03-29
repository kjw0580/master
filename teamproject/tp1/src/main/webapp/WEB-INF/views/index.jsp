<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
<link rel="stylesheet" href="/resources/css/style.css">
<style>
   .btns{margin:10px 0 10px;}
   #container img{height:700px;}
@media (min-width: 0px) and (max-width: 576px) {
#container{height:1200px;}
}
@media (min-width: 0px) and (max-width: 1100px) {
#container img{height:450px;}
}
</style>
</head>
<body>
   <jsp:include page="./menu.jsp" />
   <div class="container text-center" id="container">
      <div class="row">
         <div class="col-sm-6 link-dark">
            <img src="/resources/images/ghost.jpg" style="width:100%; border-radius: 25px; margin-top:30px;" alt="귀신">
            <button type="button" onclick= "location.href ='/board/boardList2'" class="btns btn-hover color-11 btn-lg fa-solid fa-fade "> 입장 </button>
         </div>
         <div class="col-sm-6">
            <img src="/resources/images/bonobono.jpg" style="width:100%; border-radius: 25px; margin-top:30px;" alt="웃음"> 
            <button type="button" onclick= "location.href ='/board/boardList'" class="btns btn-hover color-9 btn-lg fa-solid fa-fade "> 입장 </button>
         </div>
      </div>
   </div>
   <jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>