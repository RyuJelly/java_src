package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {
	
	// 총점을 구하는 메서드
	public static void total(int score[]) {
		for (int i = 0; i < 3; i++) {
			score[3] += score[i];
		}
	}
	
	// 평균을 구하는 메서드
	public static void average(int score[]) {
		score[4] = score[3] / 3;
	}
	
	// 출력하는 메서드
	public static void myPrint(int score[]) {
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아
		// 총점과 평균을 출력하자.
		// 모든 변수를 배열을 이용하여 구현하시오.
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int index = 0;
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("점수 입력 :");
			score[i] = sc.nextInt();
		}
		
		total(score);
		average(score);
		myPrint(score);
		

		
	}

}
