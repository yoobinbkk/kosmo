package basic3;

import java.io.IOException;

public class Test07 {

	static void method() throws IOException {
		throw new IOException();
	}
	public static void main( String [] args ) {   
		try{
			method();
			System.out.println("TRY");
		} catch( Exception ex ) {
			System.out.println("EXCEPTION");
		}
//		catch( IOException ex ) {
//			System.out.println("IOEXCEPTION");
//		}
		finally {
			System.out.println("FINALLY");
		}
		System.out.println("END");
	}

}

// 결과값 : 에러
// 이유 : 상위 예외 클래스인 Exception이 하위 예외 클래스인 IOException의 위에 위치하기 때문에.
//	추가 설명 : Exception 클래스가 IOException 클래스의 부모 클래스라서 IOException의 속성도 포함기 때문.