package singleton.car;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	//자동차 공장 인스턴스 가져오기
	public static CarFactory getInstance() {
		return instance;
	}
	
	//차를 생성
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
