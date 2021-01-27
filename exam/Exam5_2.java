package exam;

public class Exam5_2 {

	public static void main(String[] args) {
		// 배열 - 총합과 평균
		int sum = 0;
		float avg = 0f;
		
		int score[] = {100, 90, 97, 100, 89};
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			avg = sum / (float)score.length;
		}
		System.out.println("총합 : " + sum + ", 평균 : " + avg);
	}

}
