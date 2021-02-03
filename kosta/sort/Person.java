package kosta.sort;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	private Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person p) {
		// 나이 기준 오름차순
		if (age < p.age) {
			return -1;
		}else if (age > p.age) {
			return 1;
		}
		return 0;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	
	
}
