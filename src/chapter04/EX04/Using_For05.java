package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		
		// 이중 for 문을 사용해서 1~9단까지 출력
		/*		\n : enter, \t : tab
			===================================================
				1*1=1   1*2=2   1*3=3   ........... 1*9=9
				2*1=2   2*2=4   ................... 2*9=18
				...
				9*1=9   9*2=18 ...             		9*9=81
			===================================================
		*/
		
		for (int i=1 ; i<=9 ; i++) {
			for (int j=1 ; j<=9 ; j++) {
				System.out.printf("%d * %d = %d \t", i, j, (i*j));
				// System.out.print(i + " * " + j + " = " + i*j + "\t")
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		// 1단 ~ 19단 3의 배수단만 출력
		
		for (int i=1 ; i<=19 ; i++) {
			for (int j=1 ; j<=9 ; j++) {
				if (i%3 == 0) {
					System.out.printf("%d * %d = %d \t", i, j, (i*j));
				}
			}
			if (i%3==0) {
				System.out.println();
			}
		}
		
		/*
		
		for (int i=1 ; i<=19 ; i++) {
			if (i%3 == 0) {
			for (int j=1 ; j<=9 ; j++) {
					System.out.printf("%d * %d = %d \t", i, j, (i*j));
			}}
			System.out.println();
		}
		
		*/
		
		/*
		
		for (int i=3 ; i<=19 ; i+=3) {
			for (int j=1 ; j<=9 ; j++) {
					System.out.printf("%d * %d = %d \t", i, j, (i*j));
			}
			System.out.println();
		
		*/
		
		System.out.println("===========================");
		
		/*
				스케너에서 입력 받은 단만 출력 (1~9단)
				출력할 단을 입력하세요 (1~9단)>>>
				=========
				1*1=1
				1*2=2
				...
				1*9=9
		*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("출력할 단을 입력하세요 (1~9단)>>>");
		int a = sc.nextInt();
		
		for (int i=1 ; i<=9 ; i++) {
			if (i==a) {
				for (int j=1 ; j<=9 ; j++) {
					System.out.printf("%d * %d = %d \t", i, j, (i*j));
				}
			}
			System.out.println();
		}
		
		
		// 시범
		/*
		
		Scanner sc = new Scanner (System.in);
		System.out.println("출력할 단을 입력하세요 (1~9단)>>>");
		int i = sc.nextInt();
		
		for (int j=1 ; j <=9 ; j++) {
			System.out.printf("%d * %d = %d \t", i, j, (i*j));
		}
		
		*/
		
		sc.close();

	}

}
