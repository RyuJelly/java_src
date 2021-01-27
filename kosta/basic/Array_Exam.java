package kosta.basic;

import java.util.Scanner;

public class Array_Exam {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
		int arr[]; // 배열 선언 => 주소값을 넣을 수 있는 변수가 생성
		arr = new int[5]; // 배열 생성(여러개의 데이터를 담을 수 있는 변수 생성), 생성괸 주소를 arr에 대입
		
		// 2. 배열 선언, 생성 함께
		int arr2[] = new int[5];
		
		// 3. 배열 선언, 생성, 초기화 함께
		int arr3[] = {1,2,3,4,5};
		
		// for문을 이용해서 전체 배열요소를 출력하자.
		// arr3[0] = 1  <= 출력형식
//		for (int i=0; i<arr3.length; i++) {
//			System.out.println("arr[" + i + "] = " + arr3[i]);
		
		// 향샹된 for문을 이용해서 출력하자.
//		for (int n : arr3) {
//			System.out.print(n + ",");		
//		}
		
		// 배열 사용 시퀀스
		// 1. 배열에 사용될 데이터타입은 무엇인가? => 같은 종류의 타입만 가능
		// 2. 배열의 크기를 결정 => 크기 초과사용 => ArrayIndexOutOfBoundsException
		// 3. 배열을 어떻게 초기화(직접인덱스, for문, 생성과 동시에)
		// 4. 배열에 있는 데이터 출력(for문, 향상된 for문)
		
		// 구구단 7단의 결과를 배열 안에 초기화 후 출력해 보자.
//		int gugu[] = new int[9];
//		for (int dan=7, i=0; i<gugu.length; i++) {
//			gugu[i] = dan * (i+1);
//			System.out.printf("%d * %d = %d%n", dan, i+1, gugu[i]);
//		}
		
		// 문자열 배열을 생성 후 키보드로 부터 데이터를 초기화 => q 문자를 입력 할때까지
		// nextLine() : 키보드로부터 한줄 입력
		// 배열 전체 내용을 출력
		String strArr[] = new String[10];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while (true) {
			System.out.println("입력 : ");
			String str = sc.nextLine();
			if (str.equals("q")) break;
			strArr[index++] = str;
		}
		for(int i=0; i<index; i++) {
			System.out.println(strArr[i]);
		}
	}

}
