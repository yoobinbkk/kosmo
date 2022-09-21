package basic3;

public class EX03_CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("Hi");
		
		add(a, b);
		System.out.println("A = " + a + ", B = " + b);		// A = 안녕Hi, B = Hi
		
	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("A = " + a + ", B = " + b);		// A = 안녕Hi, B = Hi
	}

}


/*
	문자열 처리 클래스
	
	- String
	- StringBuffer / StringBuilder
*/

// CallByReference --> 원본을 바꾼다.