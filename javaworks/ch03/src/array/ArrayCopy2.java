package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		//System 클래스의 arraycopy() 함수 사용
		int[] a = {1, 2, 3, 4};
		int[] a2 = new int[4];
		
		//new로 생성하지 않고 직접 클래스이름으로 접근
		//arraycopy(대상배열, 대상배열인덱스, 복사할배열 인덱스, 배열의 길이)
		System.arraycopy(a, 0, a2, 0, 4); //a를 a2에 복사
		for(int i = 0; i < a2.length; i++) {
			System.out.println(a2[i] + " ");
		}
	}
}
