package kosta.board;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	private int seq;
	private int hitcount;
	private Board board[];
	
	public Main() {
		Board board = new Board();
		showBoard();
	}

	private void showBoard() {
		String title = null;
		String writer = null;
		String contents = null;
		String menu = null;
		
		do {
			
			System.out.println("1. 글쓰기");
			System.out.println("2. 전체출력");
			System.out.println("3. 글세부조회");
			System.out.println("4. 수정/삭제");
			System.out.println("5. 검색(제목, 작성자)");
//			System.out.println("6. 정렬(기본)");
			System.out.println("6. 댓글");
			System.out.println("------------종료 : q");
			
			switch (menu) {
			case "1":
				System.out.println("글제목: ");
				title = Sc.sc.nextLine();
				System.out.println("작성자: ");
				writer = Sc.sc.nextLine();
				System.out.println("글내용: ");
				contents = Sc.sc.nextLine();
				
				board.newWriting(title, writer, contents);
				break;
				
			case "2":
				Board newBoard[] = new Board[seq];
				newBoard = System.arraycopy(board, 0, newBoard, 0, seq);

			default:
				break;
			}
			
		} while (!menu.equals("q"));
		
		
	}



	public static void main(String[] args) {
		

	}

}
