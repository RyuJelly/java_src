package kosta.phone;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kosta.json.Member;
import net.sf.json.JSONArray;

//import java.util.Scanner;

public class Manager {
	LinkedList<PhoneInfo> arr = new LinkedList<PhoneInfo>();

	public Manager() {
		LinkedList<PhoneInfo> arr = new LinkedList<PhoneInfo>();
	}

	public void addPhoneInfo() {
		// 이름, 전화번호, 생년월일 입력
		// PhoneInfo객체 생성 => 배열에 추가
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
		} else if (menu.equals("2")) {
			System.out.print("전공: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학번: ");
			String year = DataInput.sc.nextLine();
			arr.add(new University(name, phoneNo, birth, major, year));
		} else if (menu.equals("3")) {
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직책: ");
			String position = DataInput.sc.nextLine();
			arr.add(new Company(name, phoneNo, birth, dept, position));
		}

	}

	public void listPhoneInfo() {
		// 배열에 있는 PhoneInfo객체 모두를 출력
		// 1.전체 2. 동창 3. 직장
		System.out.println("1.전체 2. 동창 3. 직장");
		System.out.print("선택 : ");
		String menu = DataInput.sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (menu.equals("1")) {
				arr.get(i).show();
			} else if (menu.equals("2")) {
				if (arr.get(i) instanceof University) {
					arr.get(i).show();
				}
			} else if (menu.equals("3")) {
				if (arr.get(i) instanceof Company) {
					arr.get(i).show();
				}
			}
		}
	}

	public void searchPhoneInfo() {
		// 키보드로 부터 이름 입력 받아
		// 해당 PhoneInfo객체만 출력
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < arr.size(); i++) {
			PhoneInfo info = arr.get(i);
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void updatePhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < arr.size(); i++) {
			PhoneInfo info = arr.get(i);
			if (name.equals(info.getName())) {
				System.out.print("수정 전화번호 입력: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void deletePhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < arr.size(); i++) {
			PhoneInfo info = arr.get(i);
			if (name.equals(info.getName())) {
				idx = i;
				break;
			}
		}

		if (idx != -1) {
			arr.remove(idx);

		} else {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void write() {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.ser"));
			oos.writeObject(arr);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}
		}
	}

	public void read() {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.ser"));
			arr = (LinkedList<PhoneInfo>) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
			}
		}
	}

	public void addServer() {
		Socket socket = null;

		try {
			socket = new Socket("127.0.0.1", 9000);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			String jsonCode = JSONArray.fromObject(arr).toString();
			
			System.out.println(jsonCode);

			writer.write(jsonCode);
			writer.flush();
			
			JSONParser parser = new JSONParser();
			Object re = null;
			
			try {
				re = parser.parse(br.readLine());
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			if (re instanceof JSONArray) {
				System.out.println("안들어옴");
				JSONArray array = (JSONArray)re;
				Iterator iter = array.iterator();
				List<PhoneInfo> list2 = new ArrayList<PhoneInfo>();
				while(iter.hasNext()) {
					JSONObject jo = (JSONObject) iter.next();
					String name = (String) jo.get("name");
					String phoneNo = (String) jo.get("address");
					String birth = (String) jo.get("birth");
					
					list2.add(new PhoneInfo(name, phoneNo, birth));
				}
				System.out.println(list2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {}
		}

	}

	public void readServer() {
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 9000);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("들어옴");
			while (true) {
				String str = br.readLine();
				if (str.equals("")) break;
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {}
		}
	}

}
