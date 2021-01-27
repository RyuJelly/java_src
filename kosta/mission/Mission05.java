package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// Up, Down game 구현
		// 임의의 난수를 생성 : 1~100 사이의 임의의 숫자
		// 키보드로 숫자를 입력 받기
		// 입력한 숫자와 임의의 난수와 비교
		// 정답, Up, Down => 메세지 출력
		// 몇번만에 시도해서 성공
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(100) + 1;
//		System.out.println(ran);
		int count = 0;
		while (true) {
//			count += 1;
			count++;
			System.out.println("숫자를 입력 : ");
			int num = sc.nextInt();
			if (num > ran) {
				System.out.println("Up");
			}else if (num < ran) {
				System.out.println("Down");
			}else {
				System.out.println("정답");
				System.out.println("시도횟수 : " + count);
				break;
			}
		}
	}
}
