package kosta.thread;

public class SumMain {

	public static void main(String[] args) {
		SumThread t1 = new SumThread(1, 50);
		SumThread t2 = new SumThread(51, 100);
		
		t1.start();	// run()	=> 1~50
		t2.start();	// run()	=> 51~100
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.getSum() + t2.getSum());

	}

}
