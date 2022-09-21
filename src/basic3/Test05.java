package basic3;

// 다음 프로그램에서 출력 결과로 “try”라는 단어가 몇 번 출력되나?

public class Test05 {

	static void method( int i ) throws Exception {
		if ( i % 2 == 0 ) throw new Exception();
	}
	public static void main( String [] args ) {
		for( int i=0; i <= 4 ; i++ ) {
			try{
				method( i );
				System.out.println("try");
			}catch( Exception ex ) {
				System.out.println("catch");
			}
		}
	}

}

/*
	결과값: 2
	
	catch		i%2==0 --> Exception
	try			i%2==1 --> 정상 출력
	catch		i%2==0 --> Exception
	try			i%2==1 --> 정상 출력
	catch		i%2==0 --> Exception
*/