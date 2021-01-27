package kosta.oop;

public class Board {
	// 게시판에 여러개의 글을 입력받고 전체를 출력하는 프로그램을 구현하자.(생성자 기반)
	// 글번호, 글제목, 작성자, 내용
	// 글쓰기, 전체 글 출력
	int no;
	String title;
	String writer;
	String cont;
	
	public Board() {}

	public Board(int no, String title, String writer, String cont) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.cont = cont;
	}

	
	public void print() {
		System.out.printf("no.%d 제목 : %s, 작성자 : %s, 내용 : %s%n", no, title, writer, cont);
	}
	
}
