package classexam;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		System.out.println("클래스 이름 가져오기");
		Class<?> pClass1 = person.getClass();
	
		System.out.println(pClass1.getName());
		
		Class<?> pClass2 = Class.forName("classexam.Person");
	}
}
