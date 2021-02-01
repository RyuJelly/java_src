package kosta.cart;

public class Phone extends Cart implements Product {
	private int dcPrice;
	
	public Phone() {}

	public Phone(String name, int price, int dcRate) {
		super(name, price, dcRate);
	}
	

	@Override
	public void discountApply() {
		this.dcPrice = getPrice() * getDcRate() / 100;

	}

	@Override
	public void show() {
		System.out.println("상품명: " + getName() + "\t" + "가격: " + getPrice() + "\t" 
				+ "dc할인율: " + getDcRate() + "\t" + "할인된가격: " + dcPrice);

	}

	public int getDcPrice() {
		return dcPrice;
	}

	public void setDcPrice(int dcPrice) {
		this.dcPrice = dcPrice;
	}

	
	
}
