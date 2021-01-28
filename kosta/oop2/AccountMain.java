package kosta.oop2;

public class AccountMain {

	public static void main(String[] args) {
		Account arr[] = {
				new CheckingAccount("1111-1111", "홍길동", 10000, "1111-1111"),
				new MinusAccount("222-222", "콩진호", 5000, 10000)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].withdraw(6000);
//			arr[i].deposit(3000);
			arr[i].print();
			System.out.println();
		}

	}

}
