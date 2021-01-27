package kosta.basic;

public class Loop_Exam02 {

	public static void main(String[] args) {
		// 중첩 for문
		// 구구단 2~9단 출력
//		for (int i=2; i<=9; i++) {
//			System.out.println(i + "단");
//			for (int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d%n", i, j, (i * j));
//			}
//			System.out.println("--------------------");
//		}

		// 4x + 5y = 60 => 양수 x, y를 구하자.
		outerLabel:
		for (int x=0; x<=15; x++) {
			for (int y=0; y<=12; y++) {
				if (4*x + 5*y == 60) {
					System.out.println("x : " + x + ", y : " + y);
					break outerLabel;
				}
			}
		}

//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i=5; i>=1; i--) {
//			for (int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}
