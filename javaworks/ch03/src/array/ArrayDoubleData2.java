package array;

public class ArrayDoubleData2 {

	public static void main(String[] args) {
		//실수형 배열의 연산
		double[] data = new double[5];
		int size = 0;
		
		//입력
		data[0] = 10.0;
		size++;  //size = 1
		data[1] = 20.0;
		size++;  //size = 2
		data[2] = 30.0;
		size++;  //size = 3
		
		//출력 - 유효한 값만 출력
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
	}

}
