package classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("추신수");
		
		p1.name = "손흥민";
		p1.height = 183.2F;
		p1.weight = 76.7F;
		
		p2.height = 180.3F;
		p2.weight = 90.2F;
		
		p1.showInfo();
		p2.showInfo();
	}
}
