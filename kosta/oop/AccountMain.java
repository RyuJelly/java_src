package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account arr[] = {
				new Account("1111-1111", "홍길동", 10000),
				new Account("2222-2222", "콩길동", 50000)
		};
		Account account1; // 레퍼런스 변수 선언(새로 생성된 객체의 주소를 보관하기 위한 변수)
		// 인스턴스화(객체생성)
//		account1 = new Account("1111-1111", "홍길동", 10000); // 새로운 객체 생성(메모리 할당) => account1변수 : 주소값을 갖는다(인스턴스 변수 : 객체)
		
		// 객체를 초기화
//		account1.accountNo = "1111-1111";
//		account1.ownerName = "홍길동";
//		account1.balance = 10000;
		
		// 객체 메서드 호출
//		account1.deposit(5000);
//		account1.print();
		
		// 인출하기 메서드를 통해서 인출금액, 잔액의 정보를 출력하시오.
//		int result = account1.withdraw(5500);
//		System.out.println("인출금액 : " + result);
//		System.out.println("잔액 : " + account1.balance);
		
		for (Account account : arr) {
			account.deposit(5000);
			account.print();
		}
		
	}

}
