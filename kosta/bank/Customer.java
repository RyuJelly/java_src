package kosta.bank;

public class Customer {
	private String ID;
	private String name;
	private Account account;
	
	public Customer() {}

	public Customer(String ID, String name, long balance) {
		super();
		this.ID = ID;
		this.name = name;
		this.account = new Account(ID, balance);
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
