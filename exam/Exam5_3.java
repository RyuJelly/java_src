package exam;

public class Exam5_3 {

	public static void main(String[] args) {
		// 배열 - 최대값, 최소값
		int score[] = {100, 78, 94, 54, 90, 84};
		int max = score[0];
		int min = score[0];
		
		for (int i=0; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);

	}

}
