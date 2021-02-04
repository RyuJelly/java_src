package kosta.data.queueMission;

public class Order {
	private Food food;
	private int amount;
	
	public Order() {}

	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
