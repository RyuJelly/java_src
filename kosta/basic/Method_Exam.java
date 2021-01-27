package kosta.basic;

public class Method_Exam {

	// 접근제어자 리턴형 메서드이름(파라미터) {                         파라미터 <- 원료
	// 메서드 내용
	// }
	
	// 메서드 정의
	static void printCharacter(char ch, int num) {
		for (int i = 0; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static int add(int n1, int n2) {
		int sum = 0;
		sum = n1 + n2;
		return sum;
	}
	
	public static void main(String[] args) {
		printCharacter('*', 20); // 메서드 호출
		printCharacter('c', 20);
		
		int re = add(10, 20);
		System.out.println(re);
	}

}
