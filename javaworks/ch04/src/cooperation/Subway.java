package cooperation;

public class Subway {

	int train;
	int passenger;
	int money;
	
	//지하철 생성
	public Subway(int train) {
		this.train = train;
	}
	
	//승객탑승
	public void take(int money) {
		this.money += money; //요금 누적
		passenger++; //승객 추가	
	}
	
	public void showInfo() {
		System.out.println(train + "호선 열차의 수입은 : " + money + "원이고, 승객수는 " + passenger + "명입니다.");
	}
}
