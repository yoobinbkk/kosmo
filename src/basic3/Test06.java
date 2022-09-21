package basic3;

import java.io.IOException;								// IOEXCEPTION이 임포트

public class Test06 {

	static void method() throws IOException {			// 정상적으로 기입됨
		throw new IOException();
	}
	public static void main( String [] args ) {   
		try{
			method();									// IOException이 try 안에 있기 때문에 에러가 나지 않음
			System.out.println("TRY");
		} catch( IOException ex ) {
			System.out.println("IOEXCEPTION");			// 그 대신 catch 다음에 있는 "IOEXEPTION"을 출력함
		} catch( Exception ex ) {
			System.out.println("EXCEPTION");
		} finally {
			System.out.println("FINALLY");				// 그 다음 finally 안에 있는 "FINALLY"가 출력됨
		}
		System.out.println("END");						// 그리고 try-catch-finally 문 바깥에 있는 이 출력문이 출력됨
	}

}

/*
	결과값:
	IOEXCEPTION
	FINALLY
	END
*/