package array;

public class ArrayExampl1 {

	public static void main(String[] args) {
		// 배열의 선언과 사용
		// 변수를 사용 - 3명의 학생의 국어, 수학점수
		/*int std1KorScore = 70;
		int std2KorScore = 80;
		int std3KorScore = 90;
		
		int std1MathScore = 80;
		int std2MathScore = 90;
		int std3MathScore = 100;*/
		
		//배열을 이용하여 점수 저장
		/*int[] korScore = new int[3];
		korScore[0] = 70;
		korScore[1] = 80;
		korScore[2] = 90;*/
		
		//선언과 동시에 초기화
		//int[] korScore = new int[]{70, 80, 90};
		int[] korScore = {70, 80, 90};
		
		//배열의 개수
		System.out.println(korScore.length + "개");
		
		//특정한 데이터 조회(출력)
		System.out.println(korScore[1]);
		
		//수정, 변경
		korScore[2] = 95;
		System.out.println(korScore[2]);
		
		//객체 조회
		System.out.println(korScore); //주소(메모리)
		
		//전체 조회
		for(int i = 0; i < korScore.length; i++) {
//			System.out.println(korScore[i]);
			System.out.print(korScore[i] + " ");
		}

	}

}
