package kosta.oop;

public class Rectangle {
	// 가로, 세로 길이 구해서 면적을 구하는 프로그램을 만들어 보자.
	// 상태 :
	int width;
	int length;
	int extent;
	
	public Rectangle() {}
	
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}



	// 기능 :
	
	public void extent() {
		extent = width * length;
	}
	
	public void print() {
		System.out.println("면적은 : " + extent);
	}
	
}
