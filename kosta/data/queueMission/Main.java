package kosta.data.queueMission;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Order> order = new LinkedList<Order>();
		ArrayList<Food> food = new ArrayList<Food>();
		
		food.add(new Food("짜장면", 4000));
		food.add(new Food("짬뽕", 6000));
		food.add(new Food("탕수육", 10000));
		String menu = null;
		String sel = null;
		int amount = 0;
		int total = 0;
		int check = -1;
		
		while(true) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("1.주문요청 2.주문처리 3.매출액 총액 4.종료");
			System.out.print("선택: ");
			menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				do {
					System.out.print("주문하실 음식: ");
					sel = sc.nextLine();
					for (int i=0; i < food.size(); i++) {
						if (sel.equals(food.get(i).getName())) {
							check = i;
							break;
						}
					}
				} while (check == -1);
				System.out.print("수량: ");
				amount = Integer.parseInt(sc.nextLine());  // String, int 오류 줄이기
//				amount = sc.nextInt();
				order.offerLast(new Order(food.get(check), amount));

				break;
			case "2":
//				if (order.size() > 0) {
				if (!order.isEmpty()) {
					total += (order.get(0).getAmount() * order.get(0).getFood().getPrice());
					order.pollFirst();
					System.out.println("주문처리 완료");
				}else {
					System.out.println("주문이 없습니다.");
				}
				break;
			case "3":
				System.out.println("매출액 총액: " + total);
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("1~4중 선택!!!");
				break;
			}
		}

	}

}
