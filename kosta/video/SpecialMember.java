package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonus;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int bonus) {
		super(id, name, address);
		this.bonus = bonus;
	}
	

	@Override
	public void printMember() {
		super.printMember();
		System.out.println("회원의 보너스 포인터 적립 : " + bonus);
	}
	
	public void bonusPrint() {
		System.out.println("보너스 포인터 : " + bonus);
	}
	
}
