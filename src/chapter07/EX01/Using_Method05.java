package chapter07.EX01;

import java.util.Arrays;

public class Using_Method05 {
	
	// 배열을 매개변수로 가지는 메소드
	static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	static void printArrString (String[] s) {
		// 메소드의 매개변수로 들어온 배열을 출력
		for (int i=0 ; i<s.length ; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		// 배열을 매개변수로 가지는 메소드
		
		
		// 배열을 매개변수로 가지는 메소드 호출
		int[] a = new int[] {1,2,3};
		printArray (a);								// 1. 메소드 호출 시 배열 변수에 값을 할당
		
		int[] b = new int[] {1,2,3};
		printArray (b);
		
		printArray (new int[] {4,5,6});				// 2. 객체 생성 시 배열 변수에 값을 인풋
		
//		printArray ({7,8,9});						// 3. 오류 발생 : 선언과 값을 분리할 수 없어서 오류
		
		// String 배열을 선언하고 초기화 값을 할당 후 메소드 호출
		String[] s1 = new String[] {"주머니쥐", "너구리", "토끼", "스컹크", "다람쥐", "비버"};
		printArrString (s1);
		
		printArrString(new String[] {"참새", "팰리컨", "까마귀", "풍금새", "홍관조", "붉은매", "수리부엉이"});
		
//		printArrString({"오류", "발생"});
		
	}

}
