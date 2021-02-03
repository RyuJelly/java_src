package kosta.data;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListMission2 {

	public static void main(String[] args) {
		// 로또번호 1~45 중복되지 않는 정수 6개를 출력
		Random r = new Random();
		// 1. 배열로 구현
		int arr1[] = new int[7];
		int index = 0;
		
		while (index<6) {
			int ran = r.nextInt(45)+1;
			for (int i = 0; i < index; i++) {
				if (arr1[i] == ran) {
					ran = -1;
					break;
				}
			}
			if (ran != -1) {
				arr1[index++] = ran;
			}
		}
//		Arrays.sort(arr1);
		System.out.println("로또1번 배열");
		for (int i = 0; i < index; i++) {
			System.out.print(arr1[i] + ", ");
		}
		
		System.out.println();
		// 2. List 구현 contains(정수) => true/false
//		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		while(list.size()<6) {
			int ran = (int)(Math.random()*45)+1;
			if (!list.contains(ran)) {
				list.add(ran);
			}
		}
//		list.sort(null);
		Collections.sort(list);
		Iterator<Integer> iter = list.iterator();
		System.out.println("로또 2번 list");
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		
		System.out.println();
		// 3. set구현
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size()<6; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}

}
