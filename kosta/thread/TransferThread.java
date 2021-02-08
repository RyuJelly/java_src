package kosta.thread;

public class TransferThread extends Thread {
	SharedArea sharedArea;
	private void TransferThead() {}
	
	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		for (int ont = 0; ont<12; ont++) {
			sharedArea.transfer(100);
		}
	}
	
}
