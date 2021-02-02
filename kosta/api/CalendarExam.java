package kosta.api;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {
	
	public static void main(String[] args) {
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		
//		System.out.println(gc);
		String now = gc.get(Calendar.YEAR) + "년 "
							+ (gc.get(Calendar.MONTH) + 1) + "월 "
							+ gc.get(Calendar.DATE) + "일 "
							+ gc.get(Calendar.HOUR) + "시 "
							+ gc.get(Calendar.MINUTE) + "분 "
							+ gc.get(Calendar.SECOND) + "초";
		System.out.println("현재시간: " + now);
		
		// 100일 기념일
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR) + "년 "
				+ (gc.get(Calendar.MONTH) + 1) + "월 "
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분 "
				+ gc.get(Calendar.SECOND) + "초";
		System.out.println("100일 후: " + future);
		
		// 첫만남
		gc.set(2020, 11, 25);	// 12월25일
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat =
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = dateFormat.format(gc.getTime());
		System.out.println(str);
		
		// 2021 ~ 2030까지 여러분의 생일 요일 출력
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		for (int i = 2021; i <= 2030; i++) {
			gc.set(i, 3, 11);
			System.out.println(week[gc.get(gc.DAY_OF_WEEK)-1]);
		}

	}
}
