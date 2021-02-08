package kosta.thread;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	
	public PrintThread() {}

	public PrintThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		for (int ont = 0; ont < 3; ont++) {
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계: " + sum);
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
