package kosta.student;

public class S_Student extends Student {
	private int sci;
	
	public S_Student() {}

	public S_Student(String name, int kor, int eng, int mat, int sci) {
		super(name, kor, eng, mat);
		this.sci = sci;
	}


	@Override
	public void printScore() {
		super.printScore();
		System.out.println("과학점수: " + sci);
	}

	@Override
	public void printScore2() {
		setSum(getSum() + sci);
		System.out.println("총점: " + getSum());
		setAvg(getSum()/4);
		System.out.println("평균: " + getAvg());
	}
	
	
	
}
