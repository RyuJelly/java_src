package kosta.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner 외에 입출력 스트림을 이용해서 구현해보자.
		// System.in : InputStream => InputStreamReader => BufferdReader(한줄씩)
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("입력 : ");
			while((str = br.readLine()) != null) {
//				str += "\n";
				bw.write(str);
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {}
		}

	}

}
