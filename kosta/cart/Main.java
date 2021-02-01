package kosta.cart;

import java.util.Scanner;

public class Main {
	private Cart cart[];
	private int index = 0;
	
	public Main() {
//		cart = new Cart();
		showProduct();
	}
	
	private void showProduct() {
		String menu = null;
		int num = 0;
		int total =0;
		Scanner sc = new Scanner(System.in);
		
		Cart proList[] = {
				new NoteBook("맥북", 100000, 10), new NoteBook("삼성갤럭시북", 80000, 15), new NoteBook("LG그램", 78000, 20),
				new Phone("아이폰", 50000, 10), new Phone("갤럭시", 50000, 20), new Phone("망폰", 10000, 50)
		};
		
		for (int i = 0; i < proList.length; i++) {
			System.out.println("No."+ i + "\t" + proList[i].getName() + "가격: " + proList[i].getPrice() + 
										"할인율: " + proList[i].getDcRate() + "할인가: ");
		}
		
		do {
			System.out.println("1,카트에 추가 2.카트출력 3.종료");
			switch (menu) {
			case "1":
				System.out.println("카트에 추가할 물품번호: ");
				num = sc.nextInt();
				cart = new Cart[10];
				cart[index++] = proList[num];
				break;
			case "2":
				for (int i = 0; i < index; i++)
					System.out.print(cart[i].getName());
					total += cart[i].getPrice();
				System.out.println();
				break;
			case "3":
				System.out.println("종료");
				return;
			}
			
		} while(!menu.equals("3"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
