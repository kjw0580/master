package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getinstance();
		Company company2 = Company.getinstance();
		
		
		//두 인스턴스가 같은 주소인지 확인 ("=="를 사용)
		//인스턴스는 같은 주소이므로 1개로 간주할 수 있음
		System.out.println(company1);
		System.out.println(company2);
	}

}
