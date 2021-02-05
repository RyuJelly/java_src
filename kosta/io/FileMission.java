package kosta.io;

import java.io.File;

public class FileMission {
	
	static void show(File file) {
		if(file.isDirectory()) {
			System.out.println("디렉토리: " + file);
			File frr[] = file.listFiles();
			for (int i = 0; i < frr.length; i++) {
				if(file.isDirectory()) {
					show(frr[i]);
				}else {
					System.out.println("파일: " + frr[i].getName());
				}
			}
		}else {
			System.out.println("파일: " + file.getName());
		}
	}
	
	
	public static void main(String[] args) {
		String path = "C:\\Users\\KOSTA\\Downloads";
		
		show(new File(path));
//		show(new File("C:\\Users\\KOSTA\\Downloads", "test"));
		
	}

}
