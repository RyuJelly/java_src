package order;

public class Order {
	int orderNo;
	Customer customer;
	Product products[];
	int totalPrice;
	
	public Order() {}

	public Order(int orderNo, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
	}
	
	public void products() {
		products = customer.wishList;
	}
	
	public void order(Customer customer) {
		for (Product list : customer.wishList) {
			totalPrice += list.price;
		}
		System.out.println("장바구니 속 " + customer.wishList.length + "개의 물품의 총 주문 금액은 " + totalPrice + "입니다.");
	}
	
}
