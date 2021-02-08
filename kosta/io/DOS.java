package kosta.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DOS {

	private static void ls(File file) {
		File list[] = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println(list[i].getName());
				ls(list[i]);
			} else {
				System.out.println(list[i].getName());
			}
		}
	}

	private static File cd(File file, String url) {
		Arrays.asList(file.list()).contains(url);
		Arrays.stream(file.list()).anyMatch(url::equals);
		
		if (Arrays.asList(file.list()).contains(url)) {
			file = new File(file, url);
		} else {
			System.out.println("해당경로를 찾을 수 없습니다.");
		}
		return file;
	}

	private static void mkdir(File file, String url) {
		File newFile = new File(file, url);
		newFile.mkdir();
	}

	private static void cp(File file, String url) {
		File source = new File(url);
		File list[] = source.listFiles();
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				File newFile = new File(file, list[i].getName());
				
				newFile.mkdir();
				cp(newFile, list[i].getPath());
			} else {
				FileInputStream in = null;
				FileOutputStream out = null;
				byte arr[] = new byte[500];

				try {
					in = new FileInputStream(list[i]);
					out = new FileOutputStream(new File(file, list[i].getName()));
					
					while (in.read(arr) != -1) {
						out.write(arr);
						Arrays.fill(arr, (byte)0);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
						if (out != null) {
							out.close();
						}
					} catch (Exception e2) {}
				}
			}
		}
	}

	public static void main(String[] args) {
		String source = "C:\\Users\\KOSTA\\Desktop\\new_copy";   //	C:\\Users\\KOSTA\\Downloads 
		String str = null;
		File wd = new File(source);
		BufferedReader br = null;
		int count = 0;

		try {
			while (true) {
				String url = "..";

				System.out.print("> ");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();

				if (str.matches("cd\\s.+")) {
					url = str.substring(str.indexOf(" ") + 1);
					str = "cd";
				} else if (str.matches("mkdir\\s.+")) {
					url = str.substring(str.indexOf(" ") + 1);
					str = "mkdir";
				} else if (str.matches("cp\\s.+")) {
					url = str.substring(str.indexOf(" ") + 1);
					str = "cp";
				}
				
				switch (str) {
				case "ls":
					ls(wd);
					break;
				case "cd":
					File check = wd;
					wd = cd(wd, url);
					if (wd != check) {
						count--;
					}
					break;
				case "cd..":
					if (count < 4) {
						wd = wd.getParentFile();
						count++;
					} else {
						System.out.println("접근권한이 없습니다.");
					}
					break;
				case "mkdir":
					mkdir(wd, url);
					break;
				case "cp":
					cp(wd, url);
					break;
				case "q":
					return;
				case "pwd":
					System.out.println(wd);
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
