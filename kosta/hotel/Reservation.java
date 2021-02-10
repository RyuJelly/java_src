package kosta.hotel;

public class Reservation {
	private int reNum;
	First first;
	Second second;
	Third third;
	
	public Reservation() {
		reNum = 0;
	}

	public int getReNum() {
		return reNum;
	}

	public void setReNum(int reNum) {
		this.reNum = reNum;
	}

	public First getFirst() {
		return first;
	}

	public void setFirst(First first) {
		this.first = first;
	}

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}

	
	
}
