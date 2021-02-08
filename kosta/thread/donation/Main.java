package kosta.thread.donation;

public class Main {

	public static void main(String[] args) {
		Donation d = new Donation();
		
		Donor d1 = new Donor("김기부", d, 10000);
		Donor d2 = new Donor("이갑부", d, 20000);
		Donor d3 = new Donor("최진사", d, 5000);
		
		d1.start();
		d2.start();
		d3.start();

	}

}
