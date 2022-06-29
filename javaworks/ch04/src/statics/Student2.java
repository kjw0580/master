package statics;

public class Student2 {

	private static int serialNum = 100;	//기준번호
	private int id;				//학번
	private String name;		//이름
	
	public Student2() {
		serialNum++;
		id = serialNum;
	} //생성자
	
	//id를 설정하는 메서드
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	//이름을 설정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	//이름을 가져오는 메서드
	public String getName() {
		return name;
	}
}
