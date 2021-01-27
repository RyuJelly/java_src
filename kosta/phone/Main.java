package kosta.phone;

//import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Manager m = new Manager();      
      
      while (true) {
         System.out.println("1. 추가 2. 전체 출력 3. 검색 4.수정 5.삭제 6.종료");
         System.out.print("선택: ");
         String menu = DataInput.sc.nextLine();
         
         switch (menu) {
         case "1":
            try {
				m.addPhoneInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
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
            System.out.println("종료");
//            break outer;
            return;
         
         default:
            System.out.println("1~4번 메뉴중에 선택해 주세요!!!");
            break;
         }
         
      }

   }

}