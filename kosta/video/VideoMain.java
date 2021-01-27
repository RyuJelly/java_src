package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
		GeneralMember gm = new GeneralMember("1", "홍길동", "서울");
		Video v1 = new Video("01", "기생충", "송강호");
		
		gm.rentalService(v1);
		
		System.out.println("빌린 비디오제목: " + gm.getRentalVideo().getTitle());

	}

}
