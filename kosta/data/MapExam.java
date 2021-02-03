package kosta.data;

import java.util.*;
import java.util.Map.Entry;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map =
				new HashMap<String, String>();
		
		map.put("1", "NC");
		map.put("2", "두산");
		map.put("3", "KT");
		
//		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		
		System.out.println("요소의 사이즈 : " + map.size());
//		System.out.println(map.get("1"));
		
		// Map 전체목록
		// Map => Set => Iterator
		Set set = map.entrySet();
//		Set set = map.keySet();
		Iterator iter = set.iterator();	// map<key, value>
		
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Entry<String, String>) iter.next();
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
		
	}

}
