package kosta.oop;

public class BoardMain {

	public static void main(String[] args) {
		Board arr[] = {
				new Board(1, "첫글", "홍길동", "가나다라마바사"),
				new Board(2, "e글e글", "콩길동", "콩까지마 콩까지마 ")
		};
		
//		Board b1 = new Board(1, "첫글", "홍길동", "가나다라마바사");
//		Board b2 = new Board(2, "e글e글", "콩길동", "콩까지마 콩까지마 ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}


	}

}
