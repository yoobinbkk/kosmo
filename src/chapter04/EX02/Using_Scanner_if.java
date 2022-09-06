package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		
		// 문제 : Scanner로 정수값을 인풋 받아서 
		// 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if 문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상: "B 학점"
		// 70 이상 : "C 학점", 60 이상 : "D 학점", 나머지는 : "F 학점"
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("각각 국어, 영어, 수학, 과학, 음악 점수를 입력하세요.");
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		//System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 음악 : %d", aa, bb, cc, dd, ee);
		
		double avg = (aa+bb+cc+dd+ee)/5.0;
		
		if (avg <= 90) {
			System.out.printf("A 학점 : %4.1f", avg);
		} else if (avg <= 80) {
			System.out.printf("B 학점 : %4.1f", avg);
		} else if (avg <= 70) {
			System.out.printf("C 학점 : %4.1f", avg);
		} else if (avg <= 60) {
			System.out.printf("D 학점 : %4.1f", avg);
		} else {
			System.out.printf("F 학점 : %4.1f", avg);
		}
		
		sc.close();
			
		
		

	}

}
