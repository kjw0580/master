package singleton.car;

public class Car {

	private static int serialNum = 10000; //기준 번호
	private int carNum; //차번호
	
	public Car() {
		serialNum++; //기준 + 1
		carNum = serialNum; //차번호에 기준번호 넣기
	}
	
	//차 번호 가져오기
	public int getCarNum() {
		return carNum;
	}
} 
 