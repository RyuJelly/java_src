package kosta.student;

public class StudentMain {

	public static void main(String[] args) {
		Student srr[] = {
				new S_Student("홍길동", 100, 50, 89, 100),
				new S_Student("콩길동", 98, 100, 78, 69),
				new L_Student("허난설원", 90, 87, 100, 100),
				new L_Student("문돌이", 50, 90, 76, 68)
		};
		
		// 1. 문과학생만 출력
		System.out.println("1. 문과학생만 출력");
		for (int i = 0; i < srr.length; i++) {
			if (srr[i] instanceof L_Student) {
				srr[i].printScore();
				srr[i].printScore2();
			}
		}
		System.out.println();
		
		// 2. 이과학생만 출력
		System.out.println("2. 이과학생만 출력");
		for (int i = 0; i < srr.length; i++) {
			if (srr[i] instanceof S_Student) {
				srr[i].printScore();
				srr[i].printScore2();
			}
		}
		System.out.println();
		
		// 3. 전체출력
		System.out.println("3. 전체출력");
		for (int i = 0; i < srr.length; i++) {
			if (srr[i] instanceof L_Student) {
				L_Student ls = (L_Student) srr[i];
				srr[i].printScore();
				srr[i].printScore2();
			}else if (srr[i] instanceof S_Student) {
				S_Student ss = (S_Student) srr[i];
				srr[i].printScore();
				srr[i].printScore2();
			}
			

		}
		
	}

}
