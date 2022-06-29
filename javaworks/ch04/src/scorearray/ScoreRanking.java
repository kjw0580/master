package scorearray;

public class ScoreRanking {

	public static void main(String[] args) {
		// 순위 정하기
		int[] score = {80, 90, 74, 100, 50};
		int[] rank = new int[5];
		//rank = {1, 1, 1, 1, 1};
		
		for(int i = 0; i < score.length; i++) {
			int count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) {
					count++;
				}
				rank[i] = count;
			}
		}
		for(int r : rank) {
			System.out.println(r);
		}

	}

}
