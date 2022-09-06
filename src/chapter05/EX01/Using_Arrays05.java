package chapter05.EX01;

import java.util.Arrays;

public class Using_Arrays05 {

	public static void main(String[] args) {
		
		// 1~500 까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력, 2. for 문으로 출력, 3. Enhanced For, 4. Arrays.toString()
		// 합계 :		평균 :
		
		int[] arr = new int[500/3];
		int sum = 0;
		int count = 0;
		
		System.out.println("=====for 문으로 3의 배수 출력=====");
		
		for (int i=0, j=3 ; i<arr.length ; i++, j+=3) {
			System.out.print((arr[i] = j) + " ");
			sum += j;
			count++;
			if (i%33==0 && i!=0) { System.out.println();}
		}
		
		double avg = sum/count;
		
		System.out.println();
		System.out.println("합계 : " + sum + ", 평균 : " + sum/count + ", 3의 배수의 갯수 : " + count);
		
		System.out.println("=====향상된 for 문으로 3의 배수 출력=====");
		
		for (int k : arr) { 
			System.out.print(k + " ");
			if (k%100 == 1 || k%100 == 2 || k%100 == 0) { System.out.println(); }
		}
		
		System.out.println("\n");
		System.out.println("합계 : " + sum + ", 평균 : " + sum/count + ", 3의 배수의 갯수 : " + count);
		System.out.println();
		
		System.out.println("=====향상된 for 문으로 3의 배수 출력=====");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		// for문의 a[i] = j 와 System.out.print(a[i])를 따로 적을 필요가 있을 수 있다.

	}

}
