package kosta.thread;

public class ThreadEx11_1 extends Thread {

	@Override
	public void run() {
		for (int i=0; i <300; i++) {
			System.out.println("-");
		}
		super.run();
	}
	
}
