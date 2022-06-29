package scorearray;

public class ScoreExample {

	public static void main(String[] args) {
		// 5명의 자바 과목 점수
		int[] score = {80, 90, 74, 100, 50};
		int sumV = 0;
		double avgV = 0.0;
		int maxV;
		int minV;
		
		// 총점
		for(int i = 0; i < score.length; i++) {
			sumV += score[i];
		}
		System.out.println("총점 : " + sumV);


		avgV = (double)sumV / score.length;
		System.out.println("평균 : " + avgV);

		//최고 점수
		maxV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(maxV < score[i]) {
				maxV = score[i];
			}
		}
		System.out.println("최고 점수 : " + maxV);
		
		//최저 점수
		minV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(minV > score[i]) {
				minV = score[i];
			}
		}
		System.out.println("최저 점수 : " + minV);
	}

}
