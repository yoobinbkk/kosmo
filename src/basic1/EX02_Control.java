package basic1;

import java.util.Scanner;

import java.util.Calendar;

/*
 * 	제어문 : 프로그램 흐름을 변경하기 위해
 * 	
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while / do~while
 * 
 * 		5) break / continue
 */

public class EX02_Control {
	
	public static void main(String[] args) {
		
				
		String id = null;
		
		Scanner input = new Scanner (System.in);
		System.out.println("주민번호를 입력하세요. >>>");
		id = input.nextLine();
		
		System.out.println("=====성별=====");
		char yim = id.charAt(7);
		System.out.println(yim);
		// 문자가 1이거나 3이거나 9라면 "남자" 출력
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면 "여자" 출력
		
		if (yim == '1' || yim == '3' || yim == '9') {
			System.out.println("남자");
		} else if (yim == '2' || yim == '4' || yim == '0') {
			System.out.println("여자");
		}
		
		System.out.println("=====출신=====");
		
		// 8 번째 문자를 chul에 
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 '서울'
		// chul 변수가 1이라면 '인천/부산'
		// chul 변수가 2이라면 '경기'
		// 
		// chul 변수가 9이라면 '제주'
		
		String home = null;
		switch (chul) {													// 1.5 이후부터는 문자, 정수, **문자열
		case '1' : home = "서울";		break;
		case '2' : home = "인천/부산";	break;
		case '3' : home = "경기";		break;
		case '9' : home = "제주";		break;			// 마지막 줄에는 break; 없어도 된다.
		}
		System.out.println(home + " 출신");
		
		System.out.println("=====나이=====");
		
//		String id = "940408-1149503";
		
		String nai = id.substring(0, 2);			// nai = "94"
		// 문자열 -> 정수 변환
//		int age2 = (int) age1;						// 오류
		int snai = Integer.parseInt(nai);			// snai = 94
		
		int age = 0;
		
		Calendar c = Calendar.getInstance();		// .getInstance 클래스 안에 있는 객체를 불러오기
		int year = c.get(Calendar.YEAR);			// 2022
		
		int century = year / 100;
		int kiloYear = century * 100;
		
		int yearIndex = year - kiloYear;			// 29
		int youngYear = kiloYear;					// 2000
		int oldYear = kiloYear - 100;				// 1900
		
		if (snai > yearIndex) {
			age = year - (oldYear + snai) + 1;
		} else if (snai <= yearIndex && snai >= 0) {
			age = year - (youngYear + snai) + 1;
		}
		System.out.println("나이 : " + age + "세");					// snai = 94 -> age = 29 , snai = 20 -> age = 3
		
	}
}
