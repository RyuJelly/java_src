package kosta.basic;

public class callBy_Exam {
	
	public static void change(int n) {
		n += 100;
	}
	
	public static void change2(int arr[]) {
		arr[0] += 20;
	}

	public static void main(String[] args) {
		int num = 50;
		int arr[] = {10};
		
		// CallByValue : 값에 의한 호출
		change(num);
		
		// CallByReference : 주소값에 의한 호출
		change2(arr);
		
		System.out.println(num);
		System.out.println(arr[0]);

	}

}
