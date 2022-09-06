package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		// float 과 double 의 정밀도
			// float : 소숫점 7자리까지 정밀도가 유지됨.
			// double : 소숫점 15자리까지 정밀도가 유지됨.
		
		float f1 = (float)1.0000001F;	// float 변수에 값을 저장할 때 casting 필요
										// casting 방법 : 변수값 앞에 (float), 변수값 뒤에 F
			//리터럴 : 변수에 저장되는 값의 호칭
		System.out.println(f1);
		
		float f2 = 1.0000000f;
		System.out.println(f2);
		
		System.out.println("===================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
		
	}

}
