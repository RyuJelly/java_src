package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
		Video v1 = new Video("1", "트랜스포머3", "서봉수");
		Video v2 = new Video("2", "쿵푸팬더2", "지성민");
		
		Video vrr[] = {
				new Video("1", "트랜스포머3", "서봉수"),
				new Video("2", "쿵푸팬더2", "지성민")
		};
		
		GeneralMember arr[] = {
				new GeneralMember("1", "홍길동", "서울"),
				new SpecialMember("2", "김철수", "서울", 10)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rentalService(vrr[i]);
			arr[i].printMember();
			SpecialMember sp = (SpecialMember) arr[1];
			sp.bonusPrint();
//			arr[1].bonusPrint();
		}
		
//		GeneralMember gm = new GeneralMember("1", "홍길동", "서울");
//		SpecialMember sm = new SpecialMember("2", "김철수", "서울", 10);
//
//		gm.rentalService(v1);
//		sm.rentalService(v2);
//		
//		gm.printMember();
//		sm.printMember();

	}

}
