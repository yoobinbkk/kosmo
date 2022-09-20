package basic2;

import java.util.Scanner;

/*
 * 	for		: 반복 횟수가 정해진 경우
 * 	while	: 반복 횟수가 확실치 않는 경우
 * 	do~while : 횟수를 모르는 경우 (조건을 나중에 비교)
 */

public class EX02_반복문구분 {

	public static void main(String[] args) {

		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력

		Scanner input = new Scanner (System.in);

		
		// 1. for 문
		
//		System.out.println("출력받기 원하시는 구구단의 단수를 입력하세요. >>>");
//		int num2 = input.nextInt();
//		
//		System.out.println("몇 번 반복하시길 원하십니까?");
//		int num1 = input.nextInt();
//
//		System.out.println("======" + num2 + "의 구구단을 " + num1 + "번 반복======");
		
//		for (int n=1 ; n<=num1 ; n++) {
//			for (int i=1 ; i<=9 ; i++) {
//				System.out.print(num2*i + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println("[종료]");
		

		// 2. while
		
//		int n = 1;
//		while (n<=num1) {
//			for (int i=1 ; i<=9 ; i++) {
//				System.out.print(num2*i + " ");
//			}
//			System.out.println();
//			n++;
//		}
//		
//		System.out.println("[종료]");
		
//		while(true) {
//			System.out.println("출력받기 원하시는 구구단의 단수를 입력하세요. >>>");
//			int num1 = input.nextInt();
//			
//			System.out.println("몇 번 반복하시길 원하십니까?");
//			int num2 = input.nextInt();
//
//			System.out.println("======" + num1 + "의 구구단을 " + num2 + "번 반복======");
//			
//			for (int n=1 ; n<=num2 ; n++) {
//				for (int i=1 ; i<=9 ; i++) {
//					System.out.print(num1*i + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("반복 종료? (Y)");
//			input.nextLine();
//			String answer = input.nextLine();
//			if (answer.equalsIgnoreCase("Y")) break;
//		}
//		
//		System.out.println("[종료]");
		
		
		// 3. do while 문으로 바꾸기
		
		do {
			System.out.println("출력받기 원하시는 구구단의 단수를 입력하세요. >>>");
			int num1 = input.nextInt();
		
			System.out.println("몇 번 반복하시길 원하십니까?");
			int num2 = input.nextInt();

			System.out.println("======" + num1 + "의 구구단을 " + num2 + "번 반복======");
		
			for (int n=1 ; n<=num2 ; n++) {
				for (int i=1 ; i<=9 ; i++) {
					System.out.print(num1*i + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("반복 종료? (Y)");
			input.nextLine();
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("Y")) break;
		} while (true);
		
		System.out.println("[종료]");

		input.close();
	}

}
