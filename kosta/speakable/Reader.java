package kosta.speakable;

public class Reader extends Man implements Speakable {
	
	public Reader() {}
	
	public Reader(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + ": 자바화이팅");

	}

}
