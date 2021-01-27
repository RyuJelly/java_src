package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 키보드로 부터 id, pass 입력받아서
		// id, pass 일치하면 => 로그인성공
		// id, pass 불일치하면 => 로그인실패
		// id 불일치 => 해당 아이디가 존재하지 않습니다.
		// pass 불일치 => 비밀번호가 일치하지 않습니다.
		// Scanner => nextLine() => 한줄 문자열을 읽어오는 기능
		// 문자열 일치 => 문자열.equals("문자열")
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요:");
		String id = sc.nextLine();
		System.out.println("패스워드를 입력해 주세요:");
		String pass = sc.nextLine();
		
		String m_id = "bim";
		String m_pass = "12345";
		
		if (m_id.equals(id) && m_pass.equals(pass)){
			System.out.println("로그인 성공");
		}else {
			if (!m_id.equals(id)) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}

	}

}
