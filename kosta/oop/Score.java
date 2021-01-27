package kosta.oop;

public class Score {
	String name;
	int math;
	int kor;
	int eng;
	int sum;
	int avg;
	
	public Score() {}

	public Score(String name, int math, int kor, int eng) {
		super();
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void sum() {
		sum = math + kor + eng;
	}
	
	public void average() {
		avg = sum / 3;
	}
	
	public void printScore() {
		System.out.println("이름: " + name  + "\t" + "수학: " + math + "\t" + "국어: " + kor + "\t" + "영어: " + eng + "\t" + "총점: " + sum + "\t" + "평균: " + avg);
	}
	
}
