package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		// 점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70 이상이면 합격 , 중첩 if 문사용 (if 내에 if문)
		// << 완료 시간 : 16:30까지
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("점수를 입력하세요. (0~100)");
		int score = sc.nextInt();
		
		System.out.println("학년을 입력하세요. (1~4)");
		int year = sc.nextInt();
		
//		if (score >= 60 && year <= 3) {
//			System.out.println("축하합니다! 합격입니다!");
//		} else if (year >= 4 && score >= 70) {
//			System.out.println("축하합니다! 합격입니다!");
//		} else {
//			System.out.println("죄송합니다. 불합격입니다.");
//		}
		
		
		// 시범
		if (score >= 60) {
			if (year != 4) {
				System.out.println("합격");			// 4학년 아니면 60점 이상 합격
			} else if (score >= 70) {
				System.out.println("합격");			// 4학년이고 70점 이상 합격
			} else {
				System.out.println("불합격");			// 4학년이고 70점 이상 아니면 불합격
			}
		} else {
			System.out.println("불합격");				// 60점 미만이면 1, 2, 3, 4 모두 불합격
		}
		
		
		sc.close();
		

	}

}
