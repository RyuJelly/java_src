package exam;

import java.util.Random;

public class Exam5_5 {

	public static void main(String[] args) {
		// 배열 - 로또만들기
		int lotto[] = new int[6];
		Random r = new Random();
		int index = 0;
		
		outer:
		while (index<6) {
			int ran = r.nextInt(45) + 1;
			for (int i=0; i<=index; i++) {
				if (ran == lotto[i]) {
					continue outer;
				}
			}
			lotto[index++] = ran;
		}
		for (int i=0; i<lotto.length; i++) {
			if (i == 5) {
				System.out.println(lotto[i]);
				break;
			}
			System.out.print(lotto[i] + ", ");
		}

	}

}
