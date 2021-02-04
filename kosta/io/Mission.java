package kosta.io;

public class Mission {

	public static void main(String[] args) {
		// 1. 바이트스트림을 이용하여 파일 복사를 구현하세요.
		String source = "C:\\Users\\KOSTA\\Downloads\\jeju.jpg";
		String dest = "C:\\Users\\KOSTA\\Downloads\\jeju2.jpg";
		
		try {
			CopyUtill.copyFile(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		

	}

}
