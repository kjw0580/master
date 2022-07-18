package chap06;

public class Test6_5 {

	public static void main(String[] args) {
		
		//1. O, X, O, O
		
		//2. 2
		
		//3
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
