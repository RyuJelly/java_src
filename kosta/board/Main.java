package kosta.board;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	private int seq;
	private int hitcount;
	private Board board;
	
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
			System.out.println("-------- 종료 : q --------");
			System.out.println("-------------------------");
			System.out.print("입력: ");
			menu = Sc.sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.print("글제목: ");
				title = Sc.sc.nextLine();
				System.out.print("작성자: ");
				writer = Sc.sc.nextLine();
				System.out.print("글내용: ");
				contents = Sc.sc.nextLine();
				
				board.newWriting(title, writer, contents);
				
				break;
				
			case "2":
				Writing all[] = board.getAll();
				for (int i =0; i < all.length; i++) {
					System.out.printf("글번호: %d\t글제목: %s\t작성자: %s\t작성일자: %s\t조회수: %d%n", all[i].getSeq(), all[i].getTitle(), all[i].getRegdate(), all[i].getHitcount());
				}
				break;
				
//			case "3":
//				board.showBorad();
//			default:
//				break;
			}
			
		} while (!menu.equals("q"));
		
		
	}



	public static void main(String[] args) {
		Main board = new Main();

	}

}
