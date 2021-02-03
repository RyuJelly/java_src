package kosta.data;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
		ArrayList<String> list =  new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
		for (int i = 0; i < num; i++) {
			String str = list.get(i);
			System.out.println(str);
		}

	}

}
