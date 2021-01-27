package kosta.basic;

import java.util.Scanner;

public class _Scanner_Error {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력1 : ");
		sc.nextInt();
		System.out.println("정수입력2 : ");
		sc.nextInt();
		
		System.out.println("문자입력 : ");
		sc.nextLine();
		String a = sc.nextLine();
		System.out.println(a);
		
		System.out.println("Done");

	}

}
