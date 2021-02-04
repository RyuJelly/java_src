package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CopyUtill {
	
	// 바이트 값을 가진 파일을 복사
	public static void copyFile(String source, String dest) throws Exception{
		FileInputStream in = null;
		FileOutputStream out = null;
		byte arr[] = new byte[500];
		int count = 0;
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			while((count = in.read(arr)) != -1){
				out.write(arr);
				Arrays.fill(arr, (byte)0);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {}
		}
		
	}
}
