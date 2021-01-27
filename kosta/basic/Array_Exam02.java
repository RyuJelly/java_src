package kosta.basic;

import java.util.Arrays;

public class Array_Exam02 {

	public static void main(String[] args) {
		int arr[][]; // 2차원 배열 선언
		arr = new int[3][2]; // arr[0][0], arr[0][1], arr[1][0] ~
		
		// 1차원 배열의 크기를 상이하게 생성
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1]  = new int[3];
		arr2[2] = new int[4];
		
		// 2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		// 배열복사
		String oldArr[] = new String[3];
		oldArr[0] = "10";
		oldArr[1] = "20";
		
		String newArr[] = new String[2];
		// 원본베열, 시작위치, 복사받을 배열, 복사시작위치, 복사 받을 개수
		System.arraycopy(oldArr, 0, newArr, 0, newArr.length);
		System.out.println(Arrays.toString(newArr));
		
//		int num = Integer.parseInt(oldArr[2]);
//		System.out.println(num);
		
	}

}
