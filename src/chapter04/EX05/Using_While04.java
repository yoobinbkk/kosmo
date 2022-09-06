package chapter04.EX05;

import java.util.Scanner;

public class Using_While04 {

	public static void main(String[] args) {

		// "그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		// 1. String s = sc.nextLine(); 인풋 받는다.
		// 2. s.split(" "); <-- 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String을 정수형으로 변환, Inter.ParseInt()
		// 4. 합계와 평균을 구하면 됩니다.
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("정수값을 입력하세요. >>>");
			String type = sc.nextLine();
			if (type.equals("그만")) {break;}
			String[] arr = type.split(" ");
			
			int sum = 0;
			int count = 0;
			
			for (int i=0 ; i<arr.length ; i++) {
				sum += Integer.parseInt(arr[i]);
				count++;
			}
			System.out.println("정수의 합 : " + sum);
			System.out.println("정수의 평균 : " + (double)sum/count);
			
		} while (true);
		System.out.println("종료합니다.");
				

	}

}
