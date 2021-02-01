package kosta.cart;

public class Cart {
	private String name;
	private int price;
	private int dcRate;
	
	public Cart() {}

	public Cart(String name, int price, int dcRate) {
		super();
		this.name = name;
		this.price = price;
		this.dcRate = dcRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDcRate() {
		return dcRate;
	}

	public void setDcRate(int dcRate) {
		this.dcRate = dcRate;
	}
	
	
}
