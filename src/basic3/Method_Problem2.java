/*
	영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고
	대문자라면 그대로 반환하는 메소드를 작성하시오.
	
	함수명 : checkUpper
	인자 : char
	리턴(반환) : char
*/

package basic3;

import java.util.Scanner;

public class Method_Problem2 {
	
	static char checkUpper (char w) {
		if (Character.isUpperCase(w)) {
			return w;
		} else {
			return Character.toUpperCase(w);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("대문자로 변환할 영문자를 입력하세요>>>");
		
		String a = input.next();				// 입력값을 a에 넣는다
		char b = a.charAt(0);
		
		char W = checkUpper(b);
		System.out.println(W);
		
		input.close();
	}

}
