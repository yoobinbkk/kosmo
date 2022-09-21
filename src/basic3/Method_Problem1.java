
/*
영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 

함수명 : checkLower

인자 : char

리턴(반환) : boolean
 */

package basic3;

import java.util.Scanner;

public class Method_Problem1 {

	static boolean checkLower (char w) {	// boolean 타입을 넣고 checkLower의 가로 안에 char 인자를 기입함
		if (Character.isLowerCase(w)) {		// if 문으로 w가 소문자인지 확인
			return true;					// 만약 맞다면 true 반환
		} else {
			return false;					// 아니라면 false 반환
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("소문자인지 확인합니다. 영문자를 입력하세요>>>");
		
		String a = input.next();				// 입력값을 a에 넣는다
		char b = a.charAt(0);

		boolean tof = checkLower(b);		// boolean tof에 checkLower의 반환값을 넣음
		System.out.println(tof);			// 리턴값을 출력
		
		input.close();

	}

}
