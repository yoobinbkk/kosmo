package chapter05.EX03;

import java.util.Arrays;

public class ArgumentOfMainMethod02 {

	public static void main(String[] args) {
		
		// Main Method로 값 던져 주기
		
		// args.length 내용 출력하기
		System.out.println(args.length);
		
		System.out.println("===For 문을 사용해서 Main Method args 출력===");
		
		// Main Method로 넘겨진 값을 자동으로 출력하기
		for (int i=0 ; i<args.length ; i++) {
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		System.out.println("===Enhanced For===");
		
		for (String k : args) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("===Arrays.toString===");
		
		System.out.println(Arrays.toString(args));

	}

}
