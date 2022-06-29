package singleton;

public class CarFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		System.out.println(factory);
		
		Car mySonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		
		Car mSonata = factory.createCar();
		System.out.println(mSonata.getCarNum());
		
		Car ySonata = factory.createCar();
		System.out.println(ySonata.getCarNum());
	}

}
