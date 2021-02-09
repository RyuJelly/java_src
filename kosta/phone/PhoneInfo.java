package kosta.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	//멤버 변수 선언
	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo() {}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	//멤버 메서드 정의
	//1명의 전화내역 출력하기
	public void show() {
		System.out.println("이름 : " + getName());
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생년월일: " + birth);
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

	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNo=" + phoneNo + ", birth=" + birth + "]";
	}
	
	
}













