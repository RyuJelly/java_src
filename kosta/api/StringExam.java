package kosta.api;

import java.util.Arrays;

public class StringExam {
	
	public static void main(String[] args) {
		String str = "ABC";
		String str2 = new String("abc");
		
		// String 불변성
		str.concat(str2);
		System.out.println(str.concat(str2));
		
		String sql = "select * from board ";
		int num = 10;
		if (num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		// StringBuffer, StringBuilder
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);
	
		// 해당문자열의 위치를 파악 => indexOf("문자열") => 0시작, 없으면 => -1
		System.out.println(sql.indexOf("f"));
		
		// 문자열 길이
		System.out.println(sql.length());
		
		// 문자열 부분추출 subString(5), subString(5,10)
		// select * from board where num = 10
		System.out.println(sql.substring(9, 13));
		
		// sql변수에서 "board" 단어를 추출해보자.(
		System.out.println(sql.substring(sql.indexOf("b"), sql.indexOf("d")+1));
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		head = fileName.substring(0, fileName.indexOf('.'));
		pattern = fileName.substring(fileName.indexOf('.')+1);
		
		System.out.println(head + " : " + pattern);
		
		String id = "kosta";
		String m_id = "Kosta ";
		// equalsIgnoreCase => 대소문자 구분x, trim() => 앞뒤 공백 제거
		if (id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 문자열 => 배열 변환
		String fruits = "사과,배,포도,수박";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		// startWith(), endsWith() : 해당 문자열 시작/종료 하는 체크
		// 이미지파일(jpg, png, gif) 유무 체크 => kosta.jpg => 이미지 파일
		String img = "jpg, png, gif";
		String irr[] = img.split(", ");
		
		for (int i = 0; i < irr.length; i++) {
			if (fileName.endsWith(irr[i])) {
				System.out.println("이미지 파일입니다.");
			}else {
				System.out.println("일반파일");
			}
		}
		
		String path = "C:\\java_work\\JavaBasic\\src\\kosta.jpg";
		// String result = ""; // kosta_small.jpg
		String head2 = path.substring(path.indexOf("kosta"), path.indexOf("."));
		head2 += "_small";
		System.out.println(head + path.substring(path.indexOf(".")));
		
		
		
	}
}
