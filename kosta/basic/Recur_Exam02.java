package kosta.basic;

import java.util.Scanner;

public class Recur_Exam02 {

	static int total(int n) {
		if (n > 0) {
			return n + total(n-1);
		}else {
			return 0;
		}
	}
	
	static int sumArr(int n, int arr[]) {
		if (n <= arr.length-1) {
			return arr[n] + sumArr(n+1, arr);
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// 0~n 까지의 합계를 구하기 => 재귀함수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
//		
//		System.out.println("0~" + n + " 까지의 합 : " + total(n));
		
		// arr[n] ~ arr[-1] 까지의 합을 구하라. 재귀함수
		int arr[] = {10, 20, 30, 40, 50};
		
		System.out.println("arr[" + n + "]부터 arr[" + (arr.length-1) + "]까지의 합 : " + sumArr(n, arr));
		
		
	}

}
