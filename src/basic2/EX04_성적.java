package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX04_성적 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int kor[] = new int[3];
		
		System.out.println(kor.length + "명의 국어 점수를 입력하세요(ex. 10/20/30)");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for (int i=0 ; st.hasMoreTokens(); i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
		}
		
		// 출력
		for (int i=0 ; i<kor.length ; i++) {
			System.out.println((i+1) + "번 학생의 국어점수 : " + kor[i]);
		}
		
		int sum = 0;
		int count = 0;
		
		// 총점과 평균 출력
		for (int i=0 ; i<kor.length ; i++) {
			sum += kor[i];
			count++;
		}
		
		double avg = (double) sum/count;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
