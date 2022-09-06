package chapter05.EX02;

import java.util.Arrays;

public class Using_Arrays_2D02 {

	public static void main(String[] args) {
		
		// 
		
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
		
		System.out.println("======for 문으로 String 배열을 출력하기======");
		
		// 1. for 문으로 출력
		for (int i=0 ; i<arr1.length ; i++) {
			if (i==0) {System.out.print("사람 이름 : ");}
			if (i==1) {System.out.print("새 이름 : ");}
			if (i==2) {System.out.print("물고기 이름 : ");}
			if (i==3) {System.out.print("포유류 이름 : ");}
				for (int j=0 ; j<arr1[i].length ; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
		}
		
		System.out.println("======Enhanced for 문으로 String 배열을 출력======");

		// 2. Enhanced for
		for (String[] a : arr1) {
			for (String b : a) {
				if (b.equals("홍길동")) {System.out.print("사람 이름 : ");}
				if (b.equals("독수리")) {System.out.print("새 이름 : ");}
				if (b.equals("붕어")) {System.out.print("물고기 이름 : ");}
				if (b.equals("호랑이")) {System.out.print("포유류 이름 : ");}
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println("======Arrays.toString으로 String 배열을 출력======");

		// 3. Arrays.toString()
		for (int i=0 ; i<arr1.length ; i++) {
			if (i==0) {System.out.print("사람 이름 : ");}
			if (i==1) {System.out.print("새 이름 : ");}
			if (i==2) {System.out.print("물고기 이름 : ");}
			if (i==3) {System.out.print("포유류 이름 : ");}
			System.out.println(Arrays.toString(arr1[i]));
		}

	}

}
