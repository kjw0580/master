<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>유효성 검사</title>
<script type="text/javascript">
	function checkMember(){
		
		let form = document.frm;
		let id = form.id.value;
		let pw = form.pw.value;
		let name = form.name.value;
		let phone = form.phone1.value + "-" + form.phone2.value + "-" + form.phone3.value ;
		let email = form.email.value;
		
		//정규 표현식 - 이름 항목은 숫자로 시작할 수 없음.
		let regExp = /^[a-zA-Z가-힣]/;
		let regExpPasswd1 = /[a-zA-Z0-9]/;
		let regExpPasswd2 = /[~!@#$%^&*]/;

		
		//유효성 검사
		if(!regExp.test(id)){
			alert("아이디는 문자로 시작해주세요");
			form.id.select();
			return false;
		}
		if(pw.length < 8 || pw.length > 12 || !regExpPasswd1.test(pw) || !regExpPasswd2.test(pw)){
			alert("비밀번호는 영문,숫자,특수문자 포함 8~12자로 입력해주세요.");
			form.pw.select();
			return false;
		}
		
		if(pw.search(id) > -1){
			alert("비밀번호는 아이디를 포함할 수 없습니다.");
			form.name.select();
			return false;
		}
		
		if(!regExpPhone.test(phone)){
			alert("연락처를 확인해주세요");
			form.phone.select();
			return false;
		}
		
		if(!regExpEmail.test(email)){
			alert("이메일을 확인해주세요");
			form.email.select();
			return false;
		}
		form.submit();
		
	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="validation_process.jsp" method="post" name="Member">
		<p>아이디 : <input type="text" name="id">
		<p>비밀번호 : <input type="text" name="pw">
		<p>이 름 : <input type="text" name="name">
		<p>연락처 : <select name="tel">
					<option value="010">010</option>
					<option value="02">02</option>
					<option value="031">031</option>
					<option value="041">041</option>
			      </select>
			      - <input type="text" maxlength="4" size="12">
			      - <input type="text"
			      
			       maxlength="4" size="12">
		<p>이메일 : <input type="text" name="email">
		<p><input type="submit" value="가입하기">
	</form>
</body>
</html>