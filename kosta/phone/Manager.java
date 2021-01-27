package kosta.phone;

//import java.util.Scanner;

public class Manager {

   PhoneInfo arr[];
   int index = 0;
   String sName;
   String snum;
   
   public Manager() {
      arr = new PhoneInfo[10];
   }

   public void addPhoneInfo() throws Exception {
      // 이름, 전화번호, 생년월일 (키보드입력)
      // PhoneInfo객체 생성 => 배열에 추가
      System.out.print("이름: ");
      String name = DataInput.sc.nextLine();
//      sc.nextInt();
      System.out.print("전화번호: ");
      String phoneNo = DataInput.sc.nextLine();      
      System.out.print("생년월일: ");
      String birth = DataInput.sc.nextLine();      
      
      if (phoneNo == null || phoneNo.length() ==0) {
    	  throw new Exception("반드시 전화번호 입력하세요.");
      }
      
//      PhoneInfo person = new PhoneInfo(name, phoneNo, birth);
//      arr[index++] = person;
      arr[index++] = new PhoneInfo(name, phoneNo, birth);
      
   }
   
   public void listPhoneInfo() {
      // 배열에 있는 PhoneInfo객체 모두를 출력
      for (int i = 0; i < index; i++) {
         arr[i].show();
      }
   }
   
   public void searchPhoneInfo() {
      // 키보드로부터 이름을 입력받아 해당 PhoneInfo객체만 출력
      System.out.print("검색할 이름: ");
      sName = DataInput.sc.nextLine();
      int idx = -1;
      
      for (int i = 0; i < index; i++) {
         if (arr[i].getName().equals(sName)) {
            arr[i].show();
            idx = i;
            break;
         }
      }
      if (idx == -1) {   
         System.out.println("찾지 못했습니다.");
      }
      
   }
   
   public void updatePhoneInfo() {
      System.out.print("전화번호: ");
      snum = DataInput.sc.nextLine();
      int idx = -1;
      for (int i =0; i < index; i++) {
         if (snum.equals(arr[i].getPhoneNo())) {
            System.out.print("수정할 번호 입력: ");
            arr[i].setPhoneNo(DataInput.sc.nextLine());
            idx = i;
         }
      }
      if (idx == -1) {
         System.out.println("해당 번호를 찾을수 없습니다.");
      }
   }
   
   public void deletePhoneInfo(){
      System.out.print("삭제할 이름: ");
      sName = DataInput.sc.nextLine();
      int idx = -1;
      for (int i=0; i <index; i++) {
         if (arr[i].getName().equals(sName)) {
            for (int j = i; j < index; j++) {
            	if (j != arr.length) {
            		arr[j] = arr[j+1];
            	}else {
            		arr[index] = null;
            	}  
            }
            index--;
            idx = i;
            break;
         }
      }
      if (idx == -1) {
    	  System.out.println("찾을수 없습니다.");
      }
   }
}