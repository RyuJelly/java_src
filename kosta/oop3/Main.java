package kosta.oop3;

public class Main {
	
	public static void main(String[] args) {
		Study s = new Study();
		Work w = new Work();
		
		Person p = new Person("홍길동", w);
		p.doIT();
		
		Study2 s2 = new Study2();
		Work2 w2 = new Work2();
		
		Person p2 = new Person("콩길동", s2);
		p2.doIT2();
	}
}
