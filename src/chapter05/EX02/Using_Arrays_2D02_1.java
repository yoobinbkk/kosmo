package chapter05.EX02;

import java.util.Arrays;

public class Using_Arrays_2D02_1 {

	public static void main(String[] args) {
		
		String[][] arr1 = new String[][] {
			{"홍길동", "이순신", "세종대왕"},
			{"독수리", "부엉이", "닭", "오리"},
			{"붕어", "가물치", "잉어"},
			{"호랑이", "사자"}
		};
		/*
		 출력 : 	사람 이름 	: 홍길도 이순신 세종대왕
		 		 새 이름  : 독수리 부엉이 닭 오리
			   물고기 이름 	: 붕어 가물치 잉어
			   포유류 이름 	: 호랑이 사자
		*/
		
		String[] name = new String[] {"사람", "새", "물고기", "포유류"};
		
		System.out.println("======for 문으로 String 배열을 출력하기======");
		
		// 1. for 문으로 출력
		for (int i=0 ; i<arr1.length ; i++) {
			System.out.print(name[i] + " 이름 : ");
				for (int j=0 ; j<arr1[i].length ; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
		}
		
		System.out.println("======Enhanced for 문으로 String 배열을 출력======");
		
		// 2. enhanced for 문
		int e = 0;
		for (String[] a : arr1) {
			System.out.print(name[e] + " 이름 : ");
			e++;
			for (String b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println("======Arrays.toString으로 String 배열을 출력======");

		// 3. Arrays.toString()
		for (int i=0 ; i<arr1.length ; i++) {
			System.out.print(name[i] + " 이름 : ");
			System.out.println(Arrays.toString(arr1[i]));
		}

	}

}
