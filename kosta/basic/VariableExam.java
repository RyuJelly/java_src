package kosta.basic;

public class VariableExam {
	static int num2;
	
	public static void main(String[] args) {
		//변수 선언, 사용하기 위한 전제 조건
		//1. 데이터의 내용(종류) => 데이터타입 결정
		//2, 데이터의 활용하는 지점 => 변수 선언 위치
		
		//지역변수(로컬변수) : 메서드 안에서 선언된 변수
		int num1; // 변수 선언 => 메모리 할당 
		
		num1 = 10 ; //변수 초기화 => 값을 할당
		System.out.println(num1);
		System.out.println(num2);
		
		//변수는 선언된 위치(scope)가 매우 중요하다.
		int num3 = 100;
		
		if(num1 == 10) {
			num3 += 100;
		}
		System.out.println(num3);
	}
}
