package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장
		// 		- 문자, 숫자, 유니코드로 저장할 수 있다.
		//		- ' ' 를 사용해서 저장
		//		- 두 문자 이상을 넣을 수 없다. 문자열은 String으로 저장해야 한다.
		
		// 1. 문자로 저장하는 방법 : ' '
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';		// 숫자 3이 아니라 문자
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===================");
		
		// 2. 정수로 저장하는 방법
		char value4 = 65;		// 65 -> A
		char value5 = 0xac00;	// 0x는 16진수를 표현, 가 <= 0xac00
		char value6 = 51;		// 3 <== 51
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("===================");
		
		// 유니코드(2byte) : 전 세계의 모든 문자를 16진수로 표기
		
		// 3. 유니코드 형식으로 저장 (\\u유니코드)
		char value7 = '\u0041';			// '\u0041' -> A
		System.out.println(value7);
		char value100 = 35;				// 35 -> #
		System.out.println(value100);
		char value101 = '\uac12';		// 'ac12' -> 값
		System.out.println(value101);
		char value102 = '\uac00';		// 가
		char value103 = '\uac33';		// 3
		
		System.out.println("===================");
		
		// 구글 검색을 사용해서 자신의 이름의 유니코드를 찾아서 char 변수에 저장해서 출력
		
		char name01 = '\uc784';
		char name02 = '\uc720';
		char name03 = '\ube48';
		
		System.out.print(name01);
		System.out.print(name02);
		System.out.print(name03 + "\n");
		
		//System.out.println(name01 + name02 + name03);			// 오류
		
		System.out.println("===================");
		
		// 문자 A를 저장하는 다양한 방법
		char a = 'A';			// 그대로 출력
		char b = 65;			// 정수로 저장 (10진수)
		char c = 0b1000001;		// 0b : 뒤에 오는 값이 2진수라는 뜻
		char d = 00101;			// 0 : 뒤에 오는 값이 8진수
		char e = 0x0041;		// 0x : 뒤에 오는 값은 16진수
		char f = '\u0041';		// 유니코드로 값을 할당
		
		System.out.println((int)a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
