package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 입력 => 총점, 평균
		// 2명 이상의 성적을 입력 받음 => 2차원 배열
		// 국어	영어	수학	총점	평균 <- 출력형식
		// 전체 출력
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[2][5];
		String subjects[] = {"국어", "영어", "수학", "총점", "평균"};
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i+1 + "번 학생 " + subjects[j] + "점수 입력 : ");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
				score[i][4] = score[i][3] / 3;
			}			
		}
		
		// 정렬 api
//		Arrays.sort(score, new Comparator<int []>() {
//
//			@Override
//			public int compare(int [] o1, int [] o2) {
//				if (o1[4] > o2[4]) {
//					return -1;
//				}else if (o1[4] < o2[4]) {
//					return 1;
//				}else {
//					return 0;
//				}
//			}
//		});
		
		// 정렬(내림차순)
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (score[i][4] < score[j][4]) {
					int tmp[];
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		
		for (String s : subjects) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
