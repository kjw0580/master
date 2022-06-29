package cooperation;

public class Person2 {

	String name; //이름
	int money; //가진 돈
	
	
	//생성자
	public Person2(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//버스를 타다 메서드
	public void takeSub(Subway sb) {
		sb.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
	System.out.println(name + "님의 남은 돈은 " + money + "원입니다.");
	}
}
