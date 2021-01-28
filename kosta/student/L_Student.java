package kosta.student;

public class L_Student extends Student {
	private int lib;
	
	public L_Student() {}


	public L_Student(String name, int kor, int eng, int mat, int lib) {
		super(name, kor, eng, mat);
		this.lib = lib;
	}


	@Override
	public void printScore() {
		super.printScore();
		System.out.println("사회점수: " + lib);
	}


	@Override
	public void printScore2() {
		setSum(getSum() + lib);
		System.out.println("총점: " + getSum());
		setAvg(getSum()/4);
		System.out.println("평균: " + getAvg());
	}
	
	
	
}
