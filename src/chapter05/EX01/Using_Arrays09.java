package chapter05.EX01;

import java.util.Scanner;

public class Using_Arrays09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// 라인 전체를 통채로 인풋 받음 >>> 국어 영어 수학 과학
		//	sc.next()				e.g. 국어
		//	sc.nextLine()			e.g. 국어 영어 수학 과학
		
		System.out.println("문자열을 입력하세요 (라인 전체) >>>");
		
		String s = sc.nextLine();
		System.out.println(s);
		
		System.out.println("문자열을 입력하세요 (한 단어 : 문자열) >>>");
		
		String s2 = sc.next();
		System.out.println(s2);
		
		// 국어 80 영어 50 수학 77 과학 88				<-- 전체 라인을 인풋 받아서 공백을 기준으로 잘라서 배열에 저장

	}

}
