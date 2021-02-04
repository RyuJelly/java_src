package kosta.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriteExam {

	public static void main(String[] args) {
		// 키보드로부터 문자열을 입력받아 파일에 쓰기를 구현
		// q를 입력하면 파일 쓰기를 종료
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String text = "";
		String str = "";

		System.out.print("입력: ");
		
		while (!text.equals("q")) {
			text = sc.nextLine();
			str += text;
			str += "\n";
		}
		
		try {
			writer = new FileWriter("test.txt");
			writer.write(text);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
			}
		}

	}

}
