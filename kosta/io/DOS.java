package kosta.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DOS {
	String pwd;
	File wd;

	public DOS() {
	}

	public DOS(String pwd) {
		super();
		this.pwd = pwd;
		wd = new File(pwd);
	}

	public static void ls(File file) {
		File fileList[] = file.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println("*" + fileList[i].getName());
//				System.out.print("\t");
				ls(fileList[i]);
			} else {
				System.out.println(fileList[i].getName());
			}
		}
	}
	
	public static File cd(File file, String url) {
		File fileList[] = file.listFiles();
		int check = 0;
		for (int i =0; i<fileList.length; i++) {
			if (url.equals(fileList[i].getName())) {
				file = new File(file, url);
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("해당폴더가 존재하지 않습니다.");
		}
		return file;
	}

	public static void mkdir(File file, File newdir) {
		newdir.mkdir();
	}

	public static void cp(File file, File file2) { 	// file -> 옮길위치, file2 -> 기존위치
		File fileList[] = file2.listFiles();
		
		for (int i =0; i<fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				File copyFile = new File(file, fileList[i].getName());
				copyFile.mkdir();
				cp(new File(file, fileList[i].getName()), fileList[i]);
			}else {
				FileInputStream in = null;
				FileOutputStream out = null;

				try {
					byte arr[] = new byte[500];
					int count = 0;

					in = new FileInputStream(fileList[i]);
//					System.out.println(new File(file, fileList[i].getName()));
					out = new FileOutputStream(new File(file, fileList[i].getName()));

					while ((count = in.read(arr)) != -1) {
						out.write(arr);
						Arrays.fill(arr, (byte) 0);
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
					} catch (Exception e2) {
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		BufferedReader br = null;
		String str = "";

		String pwd = "C:\\Users\\KOSTA\\Desktop\\new_copy";
		File wd = new File(pwd);

		try {
			while (true) {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("> ");
				str = br.readLine();

				if (str.equals("ls")) {
					ls(wd);
				} else if (str.matches("cd\\s.+")) {
					String url = str.substring(str.indexOf(" ") + 1);
					wd = cd(wd, url);
				} else if (str.equals("cd..")) {
					wd = new File(wd.getParent());
				} else if (str.matches("mkdir\\s.+")) {
					String url = str.substring(str.indexOf(" ") + 1);
					mkdir(wd, new File(wd, url));
				} else if (str.matches("cp\\s.+")) {
					String url = str.substring(str.indexOf(" ") + 1);
					cp(wd, new File(url));
				} else if (str.equals("q")) {
					break;
				} else if (str.equals("pwd")) {
					System.out.println(wd);
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
