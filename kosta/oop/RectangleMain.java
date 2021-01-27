package kosta.oop;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle(sc.nextInt(), sc.nextInt());
		Rectangle rectangle2 = new Rectangle(sc.nextInt(), sc.nextInt());
		
//		System.out.print("가로 길이 입력 : ");
//		rectangle1.width = sc.nextInt();
//		rectangle2.width = sc.nextInt();
//		
//		System.out.print("세로 길이 입력 : ");
//		rectangle1.length = sc.nextInt();
//		rectangle2.length = sc.nextInt();
		
		rectangle1.extent();
		rectangle1.print();
		rectangle2.extent();
		rectangle2.print();

	}

}
