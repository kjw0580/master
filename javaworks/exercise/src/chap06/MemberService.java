package chap06;

public class MemberService {

	//필드
	String id, pw = "";
	
	public MemberService() {}
	
	public void login(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void logout(int idc) {
		if(idc == id) {
		System.out.println("로그아웃 되었습니다.");
	} else {
		return;
	}

	}
}
