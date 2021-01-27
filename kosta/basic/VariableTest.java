package kosta.basic;

public class VariableTest {

	public static void main(String[] args) {
		//1. 적절한 데이터 타입 삽입
		double n1 = 11.4 + 10;
		System.out.println(n1);
		
		double n2 = 10 + 11.4;
		System.out.println(n2);
		
		int n3 = (int)n2;
		System.out.println(n3);
		
		String n4 = n3 + "" ;
		System.out.println(n4);
		
		int n5 = Integer.parseInt(n4);
		System.out.println(n5);
		
		long a1 = 1000L;
		String a2 = "3.14";
		float a3 = Float.parseFloat(a2);
		
		int a = 220, b = 30, max;
		max = a < b ? b : a;
		System.out.println(max);
	}

}
