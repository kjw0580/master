package classexam;

public class Person {

	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public int getage() {
		return age;
	}
}
