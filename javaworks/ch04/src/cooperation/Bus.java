package cooperation;

public class Bus {
	//필드, 멤버
	int busNumber;
	int passenger;
	int money;
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber; //번스 번호 지정
	}
	
	//사람을 태우는 메서드
	public void take(int money) {
		this.money += money; //요금받기
		passenger++; // 승객수 1명 증가
	}
	
	//버스 정보 출력
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 수입은" + money + "원이고, 승객수는 " + passenger + "명입니다.");
	}
}
