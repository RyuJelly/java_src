package kosta.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", 50));
		list.add(new Person("콩길동", 80));
		list.add(new Person("고동", 5));
		list.add(new Person("이동", 28));
		list.add(new Person("류동", 35));
		list.add(new Person("최동", 68));
		
//		Collections.sort(list);
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// 이름을 기준으로 오름차순
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				}else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println(list);
		
		
	}

}
