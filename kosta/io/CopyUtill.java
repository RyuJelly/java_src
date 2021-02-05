package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CopyUtill {
	// 복사 대상 폴더 copy구현(새로운 디렉토리 생성 후 그 안에 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) throws Exception{
		 dest.mkdir();
		 if (source.isDirectory()) {
			 File frr[] = source.listFiles();
			 for (int i =0; i < frr.length; i++) {
//				 String str2 = dest + "\\" +frr[i].getName();
				 if (frr[i].isDirectory()) {
//					 copyDirectory(new File(str1), new File(str2));
					 copyDirectory(frr[i], new File(dest, frr[i].getName()));
				 }else {
					 copyFile(frr[i], new File(dest, frr[i].getName()));
				 }
			 }
		 }else {
			 copyFile(source, new File(dest, source.getName()));
		 }
	}
	
	// 바이트 값을 가진 파일을 복사
	public static void copyFile(File source, File dest) throws Exception{
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
