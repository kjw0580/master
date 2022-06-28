package classpart;

public class PersonTest {

	public static void main(String[] args) {
		//인스턴스 생성
		//생성자 오버로딩 - 이름이 같고, 매개변수나 자료형이 다른 것
		Person p1 = new Person();
		Person p2 = new Person("추신수");
		Person p3 = new Person("장그래", 165.9F, 55.3F);
		
		//p1 입력
		p1.name = "손흥민";
		p1.height = 183.2F;
		p1.weight = 76.7F;
		
		//p2 입력
		p2.height = 180.3F;
		p2.weight = 90.2F;
		
		//출력
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();	
	}
}
