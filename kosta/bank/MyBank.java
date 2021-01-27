package kosta.bank;

public class MyBank {
	private Customer customers[];
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}

	public MyBank(Customer[] customer, int customersNum) {
		super();
		this.customers = customer;
		this.customersNum = customersNum;
	}
	
	public void addCustomer(String ID, String name, long balance) {
		customers[customersNum++] = new Customer(ID, name, balance);
	}

	public Customer getCustomer(String ID) {
		Customer cust = null;
		for (int i =0 ; i < customersNum; i++) {
			if (customers[i].getID().equals(ID)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	public void setCustomer(Customer[] customer) {
		this.customers = customer;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}
	
	public Customer[] getAllCustomer() {
		return customers;
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
		
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		
		return newCustomers;
	}
	
}
