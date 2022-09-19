package basic1;

import java.lang.String;

public class EX01_Var {		// extends object {		(생략, 자동 삽입)
	
	/*
	 * 	자료형(data type)
	 * 1. 기본형
	 * 		boolean
	 * 		char
	 * 		int / long
	 * 		double
	 * 
	 * 2. 참조형
	 * 		클래스
	 * 		배열
	 * 		--> new 예약어를 통해 객체를 생성
	 * 
	 * (*) String (별종)
	 */
	
	
	
	// * 멤버 변수
	
	// 변수에 자동적으로 기본 초기값이 들어간다.
	// String a; == String a = null;
	// int b; = int b = 0;

	public static void main(String[] args) {
		
		// * 지역 변수
		
		// 문자열 변수 a 선언
		// 변수 a에 "Hello"을 지정
		String a = null;							// 습관 : null, 0를 넣어라
		a = "Hello";
		// **** a = new String("Hello");
		
		// 문자열 변수 a 선언
		// 변수 b에 200 대입
		int b = 0;
		b = 200;
		
		// 변수 a와 b 콘솔에 출력
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
