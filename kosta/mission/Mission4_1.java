package kosta.mission;

import java.util.Scanner;

public class Mission4_1 {
	// 로그인 체크 메서드
	// 메서드(id, pass) {
	// 리턴 0 => 실패, 1 => 성공
	//}
	public static int check(String id, String pass) {
		String c_id = "bim";
		String c_pass = "1234";
		if (c_id.equals(id) && c_pass.equals(pass)) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력 :");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력 :");
		String pass = sc.nextLine();
		
		if (check(id, pass) == 1) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
