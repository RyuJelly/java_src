package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 한 Map 자료구조를 구현하자.
		// 김자바 : 100, 박자바 : 50 .........
		// 시험응시자 (key) => keySet()
		// 점수(value) => values() : Collection => iterator() : Iterator
		// 총점과 평균, 최고점수, 최저점수 : Collections => max(), min()
		int total = 0;
		int avg = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 100);
		map.put("콩길동", 22);
		map.put("콩진호", 88);
		map.put("이도", 98);
		map.put("이성계", 78);
		map.put("이성계", 88);
		
		System.out.println("응시자들: " + map.keySet());
		
		Collection<Integer> values = map.values();
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = (Entry<String, Integer>) iter.next();
			total += e.getValue();
			avg = total / map.size();
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("최고점수: " + Collections.max(map.values()));
		System.out.println("최저점수: " + Collections.min(map.values()));

	}

}
