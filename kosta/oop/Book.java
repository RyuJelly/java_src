package kosta.oop;

public class Book {
	String title;
	int cost;
	int dcCost;
	
	public Book() {}

	public Book(String title, int cost) {
		super();
		this.title = title;
		this.cost = cost;
	}
	
	public void dc() {
		if (cost >= 30000) {
			dcCost = (int)(cost * 0.75);
		}else if (cost >= 20000) {
			dcCost = (int)(cost * 0.8);
		}else if (cost >= 15000) {
			dcCost = (int)(cost * 0.85);
		}else {
			dcCost = cost;
		}
	}
	
	public void printCost() {
		System.out.println(title + "교재는 정가는 " + cost + "원 할인된 가격은 " + dcCost + "원 입니다.");
	}
	
}
