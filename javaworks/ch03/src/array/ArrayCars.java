package array;

public class ArrayCars {

	public static void main(String[] args) {
		//문자형 배열 선언과 사용
//		String[] cars = new String[4];
		
		//자료 입력
		/*
		 * cars[0] = "Morning"; cars[1] = "Sonata"; cars[2] = "Sportage"; cars[3] =
		 * "K7";
		 */
		
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//전체 조회
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] + " ");
		}
		
		//수정 (Sportage -> BMW)
		cars[2] = "BMW";
		System.out.println(cars[2]);
	}
}
