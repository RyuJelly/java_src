package kosta.hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while (true) {
			System.out.println("1.고객등록 2.예약");
			String menu;
			menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addCustomer();
				break;

			case "2":
				System.out.print("전화번호를 입력해주세요: ");
				int phoneNum = sc.nextInt();
//				while (true) {
//					System.out.print("객실등급을 선택해주세요(1~3): ");
//					int roomClass = sc.nextInt();
//					if (roomClass != 0 && roomClass != 1 && roomClass != 2) {
//						System.out.println("1~3 등급중 선택해주세요.");
//					} else {
//						break;
//					}
//				}
				System.out.print("객실등급을 선택해주세요(1~3): ");
				int roomClass = sc.nextInt();
				
				m.reservation(phoneNum, roomClass);
				break;
			}
		}

	}

}
