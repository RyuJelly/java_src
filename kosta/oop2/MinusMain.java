package kosta.oop2;

public class MinusMain {
	
	public static void main(String[] args) {
		MinusAccount ma =
				new MinusAccount("222-222", "콩진호", 10000, 10000);
		
		ma.withdraw(15000);
		ma.print();

	}

}
