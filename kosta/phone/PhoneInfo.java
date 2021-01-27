package kosta.phone;

public class PhoneInfo {
	// 멤버 변수 선언
	// 멤버 메서드 정의
	private String name;
//	int phoneNo;
//	int birth;
	private String phoneNo;
	private String birth;

	public PhoneInfo() {}

//	public PhoneInfo(String name, int phoneNo, int birth) {
//		super();
//		this.name = name;
//		this.phoneNo = phoneNo;
//		this.birth = birth;
//	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	public void show() {
		System.out.println("이름: " + name + " 전화번호: " + phoneNo + " 생년월일: " + birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
