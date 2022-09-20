package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX05_성적관리프로그램 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Scanner input2 = new Scanner (System.in);
		
		System.out.println("입력할 학생 수를 입력하세요. >>>");
		int stNum = input.nextInt();
		
		int[][] arr = new int[stNum][3];
		
		for (int i=0 ; i<arr.length ; i++) {
			System.out.println((i+1) + "째 학생의 국어, 영어, 수학, 점수를 순차적으로 입력하세요>>>");
			String scoreInput = input2.nextLine();
			StringTokenizer tk1 = new StringTokenizer (scoreInput, "/");
			for (int j=0 ; tk1.hasMoreTokens() ; j++) {
				String tk2 = tk1.nextToken();
				arr[i][j] = Integer.parseInt(tk2);
				}
		}
		
		for (int i=0 ; i<arr.length ; i++) {
			
			int sum = 0;
			int count = 0;
			
			for (int j=0 ; j<arr[i].length ; j++) {
				sum += arr[i][j];
				count++;
			}
			System.out.println((i+1) + "째 학생의 총점은 " + sum + "이고, 평균은 " + (sum/count) + " 입니다.");
		}
		
		System.out.println("----------------------------------");
		
		int sumkor = 0;
		int sumeng = 0;
		int sumath = 0;
		
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				if (j==0) {
					sumkor += arr[i][j];
				}
				if (j==1) {
					sumeng += arr[i][j];
				}
				if (j==2) {
					sumath += arr[i][j];
				}
			}
		}
		
		System.out.println("국어과목 총점은 " + sumkor + "이고, 평균은 " + (sumkor/stNum) + " 입니다.");
		System.out.println("영어과목 총점은 " + sumeng + "이고, 평균은 " + (sumeng/stNum) + " 입니다.");
		System.out.println("수학과목 총점은 " + sumath + "이고, 평균은 " + (sumath/stNum) + " 입니다.");
		
		
		input.close();
		input2.close();
		
	}

}
