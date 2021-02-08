package kosta.thread.donation;

public class Donor extends Thread {
	private String threadName;
	private Donation d;
	private int n;
	
	public Donor() {}


	public Donor(String threadName, Donation d, int n) {
		super();
		this.threadName = threadName;
		this.d = d;
		this.n = n;
	}

	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			d.donate(threadName, n);
			try {
				sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Donation getD() {
		return d;
	}

	public void setD(Donation d) {
		this.d = d;
	}
	
	
}
