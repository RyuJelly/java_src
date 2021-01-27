package algorithm;

import java.util.Scanner;

public class HomeWork01 {
	static int count = 0;
	
	static int compare(int n1, int n2) {
		if (n1 < n2) {
			return count;
		} else {
			count++;
			return compare(2*n1, 3*n2);
		}
	}
	
	public static void main(String[] args) {
		// 참조 https://lee-mandu.tistory.com/314
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("#" + i + " " + compare(n1, n2));
			count = 0;
		}
		
		// 일반 
//		System.out.print("종현이 점수 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("종원이 점수 입력 : ");
//		int n2 = sc.nextInt();		
//		System.out.println(compare(n1, n2));
		
	}
	
		
	
}
