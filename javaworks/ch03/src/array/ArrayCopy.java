package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40};
		int[] array2 = new int[4];
		
		//array 복사 저장
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		//array2 출력
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}
		System.out.println("====================");
		
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		//arr 복사 저장
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		//arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//역순 ==================
		for(int i = 0; i < arr2.length; i++) {
			arr3[2-i] = arr1[i];
		}
		
		//arr3 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
