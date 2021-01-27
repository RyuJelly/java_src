package kosta.mission;

import java.util.Scanner;

public class Mission06 {
	
	  public static void menu(String arr[]) {		
		    Scanner sc = new Scanner(System.in);
		    int index = 0;
		    
		    while (true) {
			    System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			    System.out.println("입력 : ");
			    int n = sc.nextInt();
			    if (n == 1) {
			    	System.out.println("추가할 데이터 입력 : ");
			    	sc.nextLine();
			    	String str1 = sc.nextLine();
			    	arr[index++] = str1;
			    }else if (n == 2) {
			    	for (int i = 0; i < index; i++) {
			    		System.out.println(arr[i]);
			    	}
				}else if (n == 3) {			
					System.out.println("인덱스를 출력할 데이터 입력 : ");
					sc.nextLine();
				    String str2  = sc.nextLine();
				    int s_Index = -1;
				    for (int i = 0; i < index; i++) {
				    	if (str2.equals(arr[i])) {
				    		s_Index = i;
				    		break;
				    	}
				    }
				    if (s_Index != -1){
				    	System.out.println("해당값의 인덱스 : " + s_Index);
				    }else{
				    	System.out.println("값이 존재하지 않습니다.");
				    }
				}else if (n == 4) {
					 System.out.println("종료");
					 return;
				}else {
				      System.out.println("1~4사이의 숫자를 입력하세요!!!");
				}
			  }
		    }
	
	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴의 명령을 실행해 보자.
		// 1. 추가 2. 출력 3. 검색 4. 종료
		// String배열 생성
		// 입력 : 1 
		// 배열에 데이터 추가
		// 입력 : 2
		// 배열에 있는 모든 데이터가 출력
		// 입력 : 3
		// 해당 문자열의 인덱스를 출력
		// 입력 : 4
		// return;
		
		String arr[] = new String[100];
		menu(arr);
	}
}
