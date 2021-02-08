package kosta.thread;

import java.util.LinkedList;
import java.util.List;

public class Manager {
	LinkedList<String> list = new LinkedList<String>();
	
	// 진열장에 빵을 추가
	public synchronized void push(String threadName, String bread) {
		while (list.size() > 5) {
			try {
				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		list.add(bread);
		System.out.println(threadName + " : " + bread + " 만듦");
		this.notify();
	}
	
	// 진열장에서 빵을 구매
	public synchronized void pop(String threadName) {
		while (list.size() == 0) {
			try {
				System.out.println(threadName + " 대기상태");
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("진열장 빵개수 : " + list.size());
		String bread = list.pollLast();
//		String bread = list.remove(list.size() - 1);
		System.out.println(threadName + " : " + bread + " 구매");
		this.notify();
	}
	
	
}
