package kosta.board;

public class Board {
	private int seq;
	private String title;
	private String writer;
	private String contents;
	private int regdate;
	private int hitcount;
	private Writing writing[];
	
	public Board() {
		Writing writing[] = new Writing[10];
	}

	public Board(String title, String writer, String contents) {
		super();
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getRegdate() {
		return regdate;
	}

	public void setRegdate(int regdate) {
		this.regdate = regdate;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	
	public void newWriting(String title, String writer, String contents) {
		writing[seq++] = new Writing(title, writer, contents);
	}

	public Writing[] getAll() {
//		System.out.printf("글번호: %d\t글제목: %s\t작성자: %s\t작성일자: %s\t조회수: %d%n", writing[i].getSeq(), writing[i].getTitle(), writing[i].getRegdate(), writing[i].getHitcount());
		Writing newWriting[] = new Writing[seq];
		System.arraycopy(writing, 0, newWriting, 0, seq);
		return newWriting;
	}

	public Writing showBorad() {
		Writing wr = null;
		System.out.print("조회할 글번호: ");
		int sNum = Sc.sc.nextInt();
		for (int i = 0; i < seq; i++) {
			if (sNum == writing[i].getSeq()){
				wr = writing[i];
				break;
			}
		}
		return wr;
	}

}
