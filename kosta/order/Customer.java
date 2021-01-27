package order;

public class Customer {
	String name;
	int age;
	boolean gender;
	String address;
	Product wishList[];
	Product productNo;
	
	public Customer() {}

	public Customer(String name, int age, boolean gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	public void addWishList(Product product) {
		wishList[wishList.length] = product;
	}
	
}
