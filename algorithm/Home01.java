package algorithm;

import java.util.Scanner;

public class Home01 {
	
	public static int deep(int a, int b, int day) {
		if (b > a) {
			return day;
		}else {
			return deep(2*a, 3*b, ++day);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			sb.append("#" + i + " " + deep(sc.nextInt(), sc.nextInt(), 0));
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
