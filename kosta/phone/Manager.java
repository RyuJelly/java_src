package kosta.phone;

import java.util.LinkedList;

//import java.util.Scanner;

public class Manager {
	LinkedList<PhoneInfo> arr = new LinkedList<PhoneInfo>();
	
	public Manager() {
		LinkedList<PhoneInfo> arr = new LinkedList<PhoneInfo>();
	}

	
	public void addPhoneInfo() {
		//이름, 전화번호, 생년월일 입력
		//PhoneInfo객체 생성 => 배열에 추가
		// 1.전체 2. 동창 3. 직장
		System.out.println("1.전체 2. 동창 3. 직장");
		System.out.print("선택 : ");
		String menu = DataInput.sc.nextLine();
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();
		if (menu.equals("1")) {
			arr.add(new PhoneInfo(name, phoneNo, birth));
		}else if (menu.equals("2")) {
			System.out.print("전공: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학번: ");
			String year = DataInput.sc.nextLine();
			arr.add(new University(name, phoneNo, birth, major, year));
		}else if (menu.equals("3")) {
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직책: ");
			String position = DataInput.sc.nextLine();
			arr.add(new Company(name, phoneNo, birth, dept, position));
		}
				
	}
	
	public void listPhoneInfo() {
		//배열에 있는 PhoneInfo객체 모두를 출력
		// 1.전체 2. 동창 3. 직장
		System.out.println("1.전체 2. 동창 3. 직장");
		System.out.print("선택 : ");
		String menu = DataInput.sc.nextLine();
		for(int i=0;i<arr.size();i++) {
			if (menu.equals("1")) {
				arr.get(i).show();
			}else if (menu.equals("2")) {
				if (arr.get(i) instanceof University) {
					arr.get(i).show();
				}
			}else if (menu.equals("3")) {
				if (arr.get(i) instanceof Company) {
					arr.get(i).show();
				}
			}
		}
	}
	
	public void searchPhoneInfo() {
		//키보드로 부터 이름 입력 받아
		//해당 PhoneInfo객체만 출력
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<arr.size();i++) {
			PhoneInfo info = arr.get(i);
			if(name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}		
	}
	
	public void updatePhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<arr.size();i++) {
			PhoneInfo info = arr.get(i);
			if(name.equals(info.getName())) {
				System.out.print("수정 전화번호 입력: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}		
	}
	
	public void deletePhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<arr.size();i++) {
			PhoneInfo info = arr.get(i);
			if(name.equals(info.getName())){
				idx = i;
				break;
			}
		}
		
		if(idx != -1) {
			arr.remove(idx);
			
		}else {
			System.out.println("찾을 수 없습니다.");
		}		
	}	
}












