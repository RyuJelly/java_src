package kosta.thread.donation;

public class Donation{
	private int total;
	
	public synchronized void donate(String threadName, int n) {
		while ((total+n) > 100000) {
			try {
//				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		total += n;
//		System.out.println(threadName + "가 " + n + "원 기부");
		this.notify();
		System.out.println("기부총액: " + total +"원");
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
