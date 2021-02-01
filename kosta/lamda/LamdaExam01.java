package kosta.lamda;

public class LamdaExam01 {

	public static void main(String[] args) {
		// MyType => 익명내부 클래스 구현
		MyType mt1 = new MyType() {
			@Override
			public void hello() {
				System.out.println("익명내부");
			}
		};

		mt1.hello();
		
		// 람다식(익명메서드)
		MyType mt2 = () -> System.out.println("람다");
		mt2.hello();
		
		// YourType talk -> 람다식
		YourType yt1 = m -> System.out.println(m+"룡");
		yt1.talk("류");
		
		MyNumber mn = (n1, n2) -> n1 >= n2? n1 : n2;
		System.out.println(mn.getMax(10, 20));
		
		// Runnable => 람다식(1~10) 출력하자.
		Runnable r = () -> {
			for (int i = 0; i <=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
