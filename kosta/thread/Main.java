package kosta.thread;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		Baker b1 = new Baker("김탁구", m);
		Baker b2 = new Baker("콩탁구", m);
		Baker b3 = new Baker("홍탁구", m);
		
		Customer c1 = new Customer("김소비", m);
		Customer c2 = new Customer("이소비", m);
		Customer c3 = new Customer("최소비", m);

		b1.start();
		b2.start();
		b3.start();
		
		c1.start();
		c2.start();
		c3.start();
	}

}
