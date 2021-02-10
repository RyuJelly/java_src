package kosta.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<Customer> cList = new ArrayList<Customer>();
	Reservation rManager = new Reservation();
	Scanner sc = new Scanner(System.in);

	public void addCustomer() {
		System.out.println("***** 고객등록 *****");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNum = sc.nextLine();
		System.out.print("생일: ");
		String birth = sc.nextLine();
		System.out.print("성별: ");
		String gender = sc.nextLine();
		System.out.print("잔액: ");
		int balance = sc.nextInt();
		cList.add(new Customer(name, phoneNum, birth, gender, balance));
	}

	public void reservation(int phoneNum, int roomClass) {
		Customer cum;
		for (Customer c : cList) {
			if (Integer.parseInt(c.getPhoneNum()) == phoneNum) {
				if (roomClass == 1) {
					for (int i = 0; i < rManager.first.getRoom().length; i++) {
						if (rManager.first.getRoom()[i] == 0) {
							int arr[] = rManager.first.getRoom();
							arr[i] = c.getReNum();
							rManager.first.setRoom(arr);
						}
					}
				} else if (roomClass == 2) {
					for (int i = 0; i < rManager.second.getRoom().length; i++) {
						if (rManager.second.getRoom()[i] == 0) {
							int arr[] = rManager.second.getRoom();
							arr[i] = c.getReNum();
							rManager.second.setRoom(arr);
						}
					}
				} else if (roomClass == 3) {
					for (int i = 0; i < rManager.third.getRoom().length; i++) {
						if (rManager.third.getRoom()[i] == 0) {
							int arr[] = rManager.third.getRoom();
							arr[i] = c.getReNum();
							rManager.third.setRoom(arr);
						}
					}

				} else {
					System.out.println("일치하는 회원이 없습니다.");
				}
			}

//		if (roomClass == 1) {
//			for (int i = 0; i < rManager.first.getRoom().length; i++) {
//				if (rManager.first.getRoom()[i] == 0) {
//					int arr[] = rManager.first.getRoom();
//					arr[i] = cum.getReNum();
//					rManager.first.setRoom(arr);
//				}
//			}
//		} else if (roomClass == 2) {
//			for (int i = 0; i < rManager.second.getRoom().length; i++) {
//				if (rManager.second.getRoom()[i] == 0) {
//					int arr[] = rManager.second.getRoom();
//					arr[i] = cum.getReNum();
//					rManager.second.setRoom(arr);
//				}
//			}
//		} else if (roomClass == 3) {
//			for (int i = 0; i < rManager.third.getRoom().length; i++) {
//				if (rManager.third.getRoom()[i] == 0) {
//					int arr[] = rManager.third.getRoom();
//					arr[i] = cum.getReNum();
//					rManager.third.setRoom(arr);
//				}
//			}
//		} else {
//			System.out.println("1~3 등급중 선택해주세요.");
//		}
		}

	}
}
