package kosta.basic;

public class Method_Exam02 {
	
	public static void equals(int n1[], int n2[]) {
		int result = 1;
		if (n1.length == n2.length) {
			for (int i = 0; i < n1.length; i++) {
				if (n1[i] != n2[i]) {
					result = 0;
					break;
				}
			}
		}else {
			result = 2;
		}
		
		if (result == 0) {
			System.out.println("서로 내용이 불일치한다.");
		}else if(result == 1) {
			System.out.println("서로 일치 한다.");
		}else {
			System.out.println("서로 개수와 내용이 불일치 한다.");
		}
	}

	public static void main(String[] args) {
		// 메서드를 이용하여 두 배열의 개수와 내용이 일치하는지 체크
		int num1[] = {1, 2, 3, 4, 5};
		int num2[] = {1, 2, 3, 4, 6};
		int num3[] = {1, 2, 3, 4, 5, 6};
		int num4[] = {1, 2, 3, 4, 5};
		
		equals(num1, num2);
		equals(num1, num3);
		equals(num1, num4);
		
	}

}
