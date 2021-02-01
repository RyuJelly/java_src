package kosta.api;

public class WrapperExam {

	public static void printD(Double d) {
		System.out.println(d);
	}
	
	public static void printInt(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		printD(123.12);
		printInt(new Integer(100));
	}

}
