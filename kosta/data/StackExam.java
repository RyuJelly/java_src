package kosta.data;

import java.util.LinkedList;

public class StackExam {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12);
		stack.add(15);
		stack.add(20);
		
		while(!stack.isEmpty()) {
			int num = stack.removeLast();
			System.out.println(num);
		}
	}

}
