package kosta.basic;

import java.util.Scanner;

public class Loop_Exam {

	public static void main(String[] args) {
		// while : 초기식 -> 조건식 -> 명령문 -> 증감자 : 수직방향
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("1에서 10까지의 합: " + sum);
		
		// 구구단 출력
//		int dan = 7;
//		int i = 1;
//		while (i<10) {
//			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
//			i++;
//		}
		
		// for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평구조
//		int dan = 5;
//		for (int i=1; i<10; i++) {
//			System.out.printf("%d * %d = %d%n", dan, i, dan*i);;
//		}
		
		// 1~100 사이에 2의 배수 및 3의 배수가 아닌 숫자만 출력하세요
//		for (int i=1; i<=100; i++) {
//			if (i%2 != 0 && i%3 != 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i=1; i<=100; i++) {
			if (i%2 == 0 || i%3 ==0) continue;
			System.out.println(i);
		}
		
		// do~while : 명령을 먼저 실행 후 조건을 비교
		// 적어도 1번은 무조건 실행이 필요한 경우
		
		
		// 퀴즈1 > 키보드로 부터 숫자를 입력 받아 합을 구하자.
		// 음수를 입력하면 새롭게 다시 입력 받도록 하자.
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		do {
//			System.out.println("숫자를 입력해 주세요 : ");
//			num = sc.nextInt();
//		} while (num < 0);
//		
//		int sum = 0;
//		for (int i=1; i<=num; i++) {
//			sum += i;
//		}
//		System.out.println("1에서 " + num + "까지의 합 : " + sum);
		
		// 퀴즈2 > 2개의 정수를 입력 받아 b - a 결과를 출력하자.
		// b > a가 되도록 입력 받음
		// 1. do~while 입력받기
		// 2. while(true) => break;
//		int a = 0, b = 0;
//		do {
//			System.out.println("a를 입력 :");
//			a = sc.nextInt();
//			System.out.println("b를 입력 :");
//			b = sc.nextInt();
//		} while (b <= a);
//		System.out.println("b - a = " + (b - a));
		
//		while (true) {
//			System.out.println("a를 입력 :");
//			a = sc.nextInt();
//			System.out.println("b를 입력 :");
//			b = sc.nextInt();
//			if (b > a) break;
//		}
//		System.out.println("b - a = " + (b - a));
	}

}
