package order;

import java.util.Scanner;

public class orderMain {

	public static void main(String[] args) {
		Customer customers[] = {
				new Customer("홍길동", 20, true, "금천구"),
				new Customer("콩길동", 22, true, "강남구")
		};
		
		Product products[] = {
				new Product(1, "치킨", 18000),
				new Product(2, "피자", 22000)
		};
		
		Order order[] = {
				new Order(1, customers[0])
		};
		

	}

}
