package cooperation;

public class SubwayTake {

	public static void main(String[] args) {
		Person2 hu1 = new Person2("홍길동", 30000);
		Person2 hu2 = new Person2("고길동", 30000);
		
		Subway sub1 = new Subway(1);
		
		hu1.takeSub(sub1);
		hu1.showInfo();
		
		hu2.takeSub(sub1);
		hu2.showInfo();
		
		sub1.showInfo();
	}
}
