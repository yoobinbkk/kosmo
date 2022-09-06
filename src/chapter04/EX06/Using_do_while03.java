package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Boolean run = true;
		int num = 0;								// 스캐너에서 정수를 인풋
		
		do {
			System.out.println("=================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("=================================================");
			System.out.println("원하는 숫자를 입력하세요 >>>");
			num = sc.nextInt();
			if (num == 1) {
				// 1. 19단 출력
				System.out.println("==1. 19단 출력==");
				for (int i=1 ; i<=19 ; i++) {
					for (int j=1 ; j<=19 ; j++) {
						System.out.printf("%d * %d = %d \t", i, j, (i*j));
					}
					System.out.println();
				}
			} else if (num == 2) {
				// 홀수단 출력
				System.out.println("==2. 홀수단 출력==");
				for (int i=1 ; i<=19 ; i++) {
					if (i%2 == 1) {
						for (int j=1 ; j<=19 ; j++) {
							System.out.printf("%d * %d = %d \t", i, j, (i*j));
						}
						System.out.println();
					}
				}
			} else if (num == 3) {
				// 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력==");
				for (int i=1 ; i<=19 ; i++) {
					if (i%3 == 0) {
						for (int j=1 ; j<=19 ; j++) {
							System.out.printf("%d * %d = %d \t", i, j, (i*j));
						}
						System.out.println();
					}
				}
			} else if (num == 4) {
				break;
			}
		} while (run);								// 무한 루프
		System.out.println("프로그램 종료");
	}

}
