package chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {
	
//	 static int sum;										// = 0 : 필드의 static 변수는 자동으로 0
	
	static int add (int[] a) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		for (int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int subt (int[] a) {
		// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int div = a[0];
		for (int i=1 ; i<a.length ; i++) {
			div -= a[i];									// if (i==0) {continue}을 넣어서 실행할 수 있다.
		}
		return div;
	}
	
	static long mult (int[] a) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul = 1;										// 1로 해서 서로 곱하기할 수 있도록 조치
		for (int i=0 ; i<a.length ; i++) {
			mul *= a[i];
		}
		return mul;
	}
	
	static double avg (int[] a) {
		// 들어온 배열의 모든 값의 평균값을 리턴
		double sum = 0;
		for (int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}

	public static void main(String[] args) {
		
		// 1~100까지 7의 배수만 저장 후 각 메소드 호출
		
		int[] aa = new int[100/7];												// 배열의 방의 갯수 지정
		
		for (int i=0, j=7 ; i<aa.length ; i++, j+=7) {
			aa[i] = j;
		}
				
		System.out.println(Arrays.toString(aa));
		System.out.println(aa.length);
		
		System.out.println("===============================");
		
		// 메소드 호출
		int sum = add(aa);
		System.out.println("더한 값 : " + sum);
		
		int negative = subt(aa);
		System.out.println("뺀 값 : " + negative);

		long multiple = mult(aa);											// int : 1760012288
		System.out.println("곱한 값 : " + multiple);							// long : 4513787149822699520

		double avg = avg(aa);											// 메소드 명과 변수명이 같아도 멀쩡하게 작동함. 서로 다르게 인식됨.
		System.out.println("평균 값 : " + avg);

		
		
		
		
	}

}
