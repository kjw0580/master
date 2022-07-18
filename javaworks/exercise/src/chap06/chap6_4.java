package chap06;

public class chap6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. void, return, ..... 오버로딩
		
		//2. O, X, O, O 
		
		//3
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}


		//4
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
