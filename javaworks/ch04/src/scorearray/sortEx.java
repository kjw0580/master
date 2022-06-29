package scorearray;

public class sortEx {

	public static void main(String[] args) {
		// 정령(버블 정렬) - 오름차순
		int[] arr = {3, 6, 9, 2, 5, 4};
		int i, j, temp;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
