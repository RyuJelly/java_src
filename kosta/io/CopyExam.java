package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyExam {

	public static void main(String[] args) {
		// poem.txt -> poem2.txt : copy
		// FileReader : read() -> FileWriter : writer()
		
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[100];
		
		try {
			reader = new FileReader("poem.txt");
			writer = new FileWriter("poem2.txt");
			
			reader.read(arr);
			writer.write(arr);
			
			System.out.println("완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {}
		}
		

	}

}
