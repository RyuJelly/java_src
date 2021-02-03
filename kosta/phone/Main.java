package kosta.phone;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			System.out.println("1.추가 2.전체 출력 3.검색 4.수정 5.삭제 6.정렬 7.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				Collections.sort(m.arr, new Comparator<PhoneInfo>() {

					@Override
					public int compare(PhoneInfo o1, PhoneInfo o2) {
						if (o1.getBirth().compareTo(o2.getBirth()) > 0) {
							return 1;
						}else if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
							return -1;
						}
						return 0;
					}
				});
				break;
			case "7":
				System.out.println("프로그램 종료");
				return;
			}
			
		}

	}

}










