package kost.exception;

public class Exam_Exception {
	
	public static void add()throws Exception {
		int a = 10;
		int b = 0;
		
		a = a/b;
	}
	
	public static void multi()throws Exception {
		int a = 10;
		int b = 10;
		
		if (a == b) {
			throw new Exception("같을 수 없다.");
		}
	}

	public static void main(String[] args) {		
		int a = 10;
		int b = 0;
		
		System.out.println("1");
		try {
//			a = a/b;
//			add();
			multi();
			
			System.out.println("2");
		}catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();  // 에러메세지 정보
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("5");
		

	}

}
