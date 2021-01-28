package kosta.oop2;

public class Account {
	// 공통된 데이터 구조 (상태 => 변수)
	// 계좌번호, 계좌주, 잔액 : 상태(특성) => 맴버변수(필드) 
	// 맴버변수는 초기화하지 않는다.
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account() {}
	// 생성자 : 변수를 초기화
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 공통된 기능 : 행동(기능) => 맴버 메서드(오퍼레이션)
	// 입금하다, 출금하다, 계좌정보 출력하기.
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
		
		balance -= amount;
		
		return amount;
	}
	
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌주 : " + ownerName);
		System.out.println("잔액 : " + balance);
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
