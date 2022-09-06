package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Arrays11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// 탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수를 합과 평균
		
		
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요 >>>");
			String s = sc.nextLine();
			if (s.equals("그만")) {break;}
			String [] arr1 = s.split(" ");
			
			int member;									// 각 종목의 구성원 담는 변수
			int sum = 0;								// 각 종목의 구서우언의 합을 담는 변수
			int count = 0;								// 각 종목을 카운트하는 변수
			
			for (int i=0 ; i<arr1.length ; i++) {
				if (i%2 != 0) {
					member = Integer.parseInt(arr1[i]);
					sum += member;
					count++;
				}
			}
			System.out.println("종목의 갯수 : " + count);
			System.out.println("구성원의 합 : " + sum);
			System.out.println("구성원의 평균 : " + sum/(double)count);
			
		} while (true);
		System.out.println("프로그램 종료합니다.");
		
		
		
		
		

	}

}
