package kosta.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리 ex)56872
		// 짝수의 수: 3개
		// 홀수의 수: 2개
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 정수 입력 : ");
		
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		even += (num/10000%2 == 0) ? 1 : 0;
		even += (num/1000%10%2 == 0) ? 1 : 0;
		even += (num/100%10%2 == 0) ? 1 : 0;
		even += (num/10%10%2 == 0) ? 1 : 0;
		even += (num%2 ==0) ? 1 : 0;
		
		odd = 5 - even;
		
		System.out.println("짝수의 수 : " + even);
		System.out.println("홀수의 수 : " + odd);
		
//		int num = 68931;
//		int a = 0, b = 0, n;
//		
//		n = (int)(num/10000)%2 == 0 ? a += 1 : b += 1;
//		n = (int)(num%10000)/1000%2 == 0 ? a : b;
//		n = (int)(num%10000%1000)/100%2 == 0 ? a : b;
//		n = (int)(num%10000%1000%100)/10%2 == 0 ? a : b;
//		n = (int)(num%10000%1000%100%10)%2 == 0 ? a : b;
//		
//		


	}

}