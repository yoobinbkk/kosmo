package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX05_성적관리프로그램2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.println("입력할 학생 수를 입력하세요. >>>");
		int stNum = input.nextInt();
		input.nextLine();

		int[][] arr = new int[stNum][3];
		
		int sumkor = 0;
		int sumeng = 0;
		int sumath = 0;

		for (int i=0 ; i<arr.length ; i++) {
			System.out.println((i+1) + "째 학생의 국어, 영어, 수학, 점수를 순차적으로 입력하세요>>>");
			String scoreInput = input.nextLine();
			StringTokenizer tk1 = new StringTokenizer (scoreInput, " ");
			for (int j=0 ; tk1.hasMoreTokens() ; j++) {
				String tk2 = tk1.nextToken();
				arr[i][j] = Integer.parseInt(tk2);
			}
			sumkor += arr[i][0];
			sumeng += arr[i][1];
			sumath += arr[i][2];
		}
		
		for (int i=0 ; i<arr.length ; i++) {
			int sum = 0;
			for (int j=0 ; j<arr[i].length ; j++) {
				sum += arr[i][j];
			}
			System.out.printf("%d째 학생의 총점은 %d 이고, 평균은 %.2f 입니다.\n", i+1, sum, (double)sum/3);			// 학생의 총점과 평균 점수를 출력
		}
		
		System.out.println("----------------------------------");

		System.out.println("국어과목 총점은 " + sumkor + "이고, 평균은 " + (double)sumkor/stNum + " 입니다.");
		System.out.println("영어과목 총점은 " + sumeng + "이고, 평균은 " + (double)sumeng/stNum + " 입니다.");
		System.out.println("수학과목 총점은 " + sumath + "이고, 평균은 " + (double)sumath/stNum + " 입니다.");


		input.close();

		
	}

}
