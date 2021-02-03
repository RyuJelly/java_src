package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void show(List<String> list) {
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로 부터 문자열을 입력받아
		// 데이터 추가, 삭제, 출력을 구현하라.
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.추가 2.삭제 3.출력 4.종료");
			System.out.print("입력: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("추가할 데이터: ");
				String data = sc.nextLine();
				list.add(data);
				break;
			case "2":
				System.out.println("삭제할 데이터: ");
				String data2 = sc.nextLine();
				int index = list.indexOf(data2);
				if (index != -1) {
					list.remove(index);
				}
				break;
			case "3":
				show(list);
				break;
			case "4":
				System.out.println("종료");
				return;
			default:
				System.out.println("1~3번 메뉴중 선택하시오!!");
				break;
			}
		}

	}

}
