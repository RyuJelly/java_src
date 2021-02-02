package kosta.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMission {
	
	public static void main(String[] args) {
		// 2021년 2월 달력 만들기
		// 월 입력 : 2
		// <2021 2월>
		// 일 월 화 수 목 금 토
		//    1  2  3  4  5  6
		// 7  8 9 10
		Calendar gc = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력: ");
		int mon = sc.nextInt();
		System.out.println("\t\t<2021년 " + mon + "월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		gc.set(2021, mon-1, 1);
		int fir = gc.get(gc.DAY_OF_WEEK);
		int count = fir;
		int last = gc.getActualMaximum(gc.DATE);
		
		for (int i =1; i<count; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= last; i++) {
			if (fir > 7) {
				System.out.println();
				fir %=7;
			}
			System.out.print(i + "\t");
			fir++;
		}
	}
}
