package kosta.basic;

import java.util.Random;

public class Random_Exam {

	public static void main(String[] args) {
		// Math클래스 random() 사용
		int d = (int)(Math.random() * 6) + 1;		
//		System.out.println(d);
		
		// Random클래스 nextInt() 사용
		Random r = new Random();
		int d2 = r.nextInt(6) + 1;
		System.out.println(d2);
	}

}
