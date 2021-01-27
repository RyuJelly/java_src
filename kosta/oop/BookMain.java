package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		Book arr[] = {
				new Book("JAVA", 30000),
				new Book("JSP", 25000),
				new Book("Oracle", 15000)
		};

		for (Book b : arr) {
			b.dc();
			b.printCost();
		}
		
	}

}
