package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		
		// 한국을 빛낸 5명의 위인들만 s String 배열 저장 후 4 가지 출력
		
		String[] n = new String [5];
		
		n[0] = "세종대왕";
		n[1] = "이순신";
		n[2] = "정약용";
		n[3] = "단군";
		n[4] = "안중근";
		
		System.out.println("===일일이 적기===");
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		
		System.out.println("===for 문으로 출력===");
		for (int i=0 ; i<n.length ; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("===향상된 for 문으로 출력===");
		for (String k:n) {
			System.out.println(k);
		}
		
		System.out.println("===Arrays.toString()으로 출력===");
		System.out.println(Arrays.toString(n));

	}

}
