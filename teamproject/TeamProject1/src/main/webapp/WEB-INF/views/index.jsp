<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
<link rel="stylesheet" href="/resources/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<style>
   .btns{margin:10px 0 10px;}
   
</style>
</head>
<body>
   <jsp:include page="./menu.jsp" />
   <div class="container text-center">
      <div class="row">
         <div class="col-sm-6 link-dark">
            <img src="/resources/images/ghost.jpg" style="width:650px; height: 700px; border-radius: 10px"  alt="귀신">
            <button type="button" class="btns btn btn-danger btn-lg"> 입장 </button>
         </div>
         <div class="col-sm-6">
            <img src="/resources/images/bonobono.jpg" style="width:650px; height: 700px" alt="웃음"> 
            <button type="button" class="btns btn btn-info btn-lg"> 입장 </button>
         </div>
      </div>
   </div>
   <jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>