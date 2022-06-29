package singleton;

public class Company {
	//유일하게 생성한 인스턴스(객체 생성과 관계없이 필요한 곳에 바로 사용)
	private static Company instance = new Company();
	
	//생성자는 외부에서 호출할 수 없도록 함
	private Company() {}
	
	//객체를 반환하는 함수
	public static Company getinstance() {
		return instance;
	}
}
