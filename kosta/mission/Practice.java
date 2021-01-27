package kosta.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6};
		int arr2D[][] = {{11,12}, {13,14}};
		int arr2D2[][] = {{11,12}, {13,14}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));

		System.out.println(Arrays.equals(arr2D, arr2D2));
		System.out.println(Arrays.deepEquals(arr2D, arr2D2));
		
		int arr2[] = Arrays.copyOf(arr, 5);
		int arr3[] = Arrays.copyOfRange(arr2, 2, 5);
		
		arr3[0] = 9;
//		System.out.println(arr2);
		System.out.println(arr3[0]);
		System.out.println(arr[2]);
		
		
	}

}
