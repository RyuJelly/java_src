package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	// 총점을 구하는 메서드
	static int sum (int n1, int n2, int n3) {
		int sum = 0;
		sum = n1 + n2 + n3;
		return sum;
	}
	
	// 평균을 구하는 메서드	
	static int average (int sum, int n2) {
		int average = 0;
		average = sum / n2;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat;
		int sum = 0;
		int avg = 0;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
//		sum = kor + eng + mat;
//		avg = (int)(sum/3.0);
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
		
		sum = sum(kor, eng, mat);
		avg = average(sum, 3);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균  : " + avg);
		
		char grade = ' ', opt = '0';
		if (avg >= 90) {
			grade = 'A';
			if (avg >= 98) {
				opt = '+';
			}else if (avg < 94) {
				opt = '-';
			}
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("학점 : " + grade + opt);
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
		
		switch (avg/10) {
		case 9: case 10:
			System.out.println("학점 : A");
			break;
		case 8:
			System.out.println("학점 : B");
			break;
		case 7:
			System.out.println("학점 : C");
			break;
		case 6:
			System.out.println("학점 : D");
			break;
		default:
			System.out.println("학점 : F");
			break;
		}
	}

}
