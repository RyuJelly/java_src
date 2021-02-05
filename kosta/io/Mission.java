package kosta.io;

import java.io.File;

public class Mission {

	public static void main(String[] args) {
		// 1. 바이트스트림을 이용하여 파일 복사를 구현하세요.
		String source = "C:\\Users\\KOSTA\\Downloads";
		String dest = "C:\\Users\\KOSTA\\Desktop\\new_copy";
		
		try {
//			CopyUtill.copyFile(new File(source), new File(dest));
			CopyUtill.copyDirectory(new File(source), new File(dest));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		

	}

}
