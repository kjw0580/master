package scorearray;

public class SortEx2 {

	public static void main(String[] args) {
			
		// 오름차순 정렬 - 문자
		char[] arr = {'S', 'B', 'M', 'K', 'C', 'Z', 'A'};
		int i, j;
		char temp;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length-1; i++) {
				if(arr[j] > arr[j +1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(char ch : arr) {
			System.out.println(ch);
		}
		for(int chw : arr) {
			System.out.println(chw);
		}
	}
}
