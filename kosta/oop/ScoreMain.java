package kosta.oop;

public class ScoreMain {

	public static void main(String[] args) {
		Score scoreArr[] = {
				new Score("일길동", 100, 95, 97),
				new Score("콩길동", 98, 88, 90),
				new Score("삼둥이", 33, 56, 78)
		};
		
		for (Score s : scoreArr) {
			s.sum();
			s.average();
			s.printScore();
		}

	}

}
