package chapter05.EX01;

import java.util.Arrays;

public class Using_Arrays12_Review {

	public static void main(String[] args) {
		
		// 1~1000 까지 배열(arr)에 저장 후 출력
		
		// 1. 배열 선언
		int[] arr = new int[1000];
		
		// 2. [입력] for 문을 사용해서 arr 배열 변수에 값을 할당
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("=============for 문으로 출력==================================================");
		
		// 3. [출력] for 문을 사용해서 arr 배열 변수에 값을 출력
		for (int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
			if (i%100 == 0 && i != 0) {System.out.println();}
		}
		
		System.out.println();
		System.out.println("=============향상된 for 문으로 출력==================================================");
				
		// 4. [출력] Enhanced For 문을 사용해서 값을 출력
		for (int e : arr) {
			System.out.print(e + " ");
			if (e%100 == 0 && e != 1000) {System.out.println();}
		}
		
		System.out.println();
		System.out.println("=============Arrays.toString(arr)==================================================");
		
		// 5. [출력] Arrays.toString(arr) 출력
		System.out.println(Arrays.toString(arr));

	}

}
