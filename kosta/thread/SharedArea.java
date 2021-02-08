package kosta.thread;

import kosta.oop2.Account;

public class SharedArea {
	Account account1;
	Account account2;
	synchronized void transfer (int amount) {
//	 void transfer (int amount) {
		account1.withdraw(10000);
		System.out.println("이몽룡계좌 : 100만원 인출");
		account2.deposit(10000);
		System.out.println("성춘향 계좌 : 100만원 입금");
	}
	synchronized int getTotal() {
//	int getTotal() {
		return account1.getBalance() + account2.getBalance();
	}
}
