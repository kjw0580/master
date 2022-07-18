package object;

public class CloneTest {

	public static void main(String[] args) {
		int[] arr1 = new int[] {10, 20, 30, 40};
		int[] arr2 = new int[4];
		int[] arr3 = new int[4];
		
		System.out.println("배열의 복사");
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] +  " ");
		}
		System.out.println("clone() 메서드 복사");
		arr3 = arr1.clone();
		for(int arr : arr3)
			System.out.print(arr +  " ");
	}

}
