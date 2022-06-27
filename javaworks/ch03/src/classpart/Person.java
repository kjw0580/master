package classpart;

public class Person {

	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person() {}
	
	//매개변수가 있는 생성자
	public Person(String n) {
		name = n;
	}
	
	//메서드
	public void showInfo() {
		System.out.println("이름 : " + name + ", 몸무게 : " + weight);
	}
}
