package kosta.oop2;

public class MinusAccount extends Account {
	// 마이너스 한도금액
	private int creditLine;
	
	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) {
		if (getBalance() + creditLine < amount) {
			return 0;
		}
		setBalance(getBalance() - amount);
		
		return amount;
	}
	
	
	
}
