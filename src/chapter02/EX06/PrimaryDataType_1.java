package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		// 업캐스팅 : 자동으로 적용 , 작은 데이터 타입에서 큰 데이터 타입으로의 변환
		// 다운캐스팅 : 수동으로 적용해야 함 , 큰 데이터 타입에서 작은 데이터 타입으로 변환
		
		// 자바에서 = 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 한다.
			// byte, short는 예외로 적용됨. 다운캐스팅됨
		
		int a = 10 ;
		float b = 10.11F ;
		
		float c = a + b ;	// 정수 a는 자동으로 float 으로 업캐스팅됨
		System.out.println(c);
		
		//int d = a + b ; 		// 오류 발생
		int d = a + (int)b ;	// 다운캐스팅하기 위해 (int) 캐스팅을 직접 넣는다. float b -> int b
		System.out.println(d);
		
		
		// boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		// 정수 : byte, short, int, long
		// 기본 값은 int 값으로 정의
		
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;	// int 값이 Long 데이터 타입으로 업캐스팅 되어서 들어감
								// L이 없어도 오류 안 남

	}

}
