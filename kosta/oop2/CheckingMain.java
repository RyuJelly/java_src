package kosta.oop2;

public class CheckingMain {

	public static void main(String[] args) throws Exception {
		CheckingAccount ca = 
				new CheckingAccount("222-222", "콩길동", 3000, "222-222");
		
		
		try {
			ca.pay("222-222", 1500);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		ca.print();

	}

}
