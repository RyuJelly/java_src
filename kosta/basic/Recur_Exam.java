package kosta.basic;

import java.util.Scanner;

public class Recur_Exam {
	
	static int f(int n) {
		if (n >= 1) {
			return n * f(n-1);
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// 재귀함수(팩토리얼 계산)
		// 5! = 5* 4 * 3 * 2 * 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int x = sc.nextInt();
		
		System.out.println(x + "! = " + f(x));
		
	}

}
