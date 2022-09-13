package chapter07.EX04;

import java.util.Scanner;

class Converter {		// 환율을 계산하는 클래스
	// 1. 필드
	double rate;		// 환율을 저장하는 변수 : 1$ = 1377.30W
	
	// 2. 메소드 생성 (달러를 인풋 받아서 원화를 반환하는 메소드), 메소드 이름 : toKWR()
	double toKWR(double dollar) {
		return dollar * rate;
	}
	
	// 3. 메소드 생성 (원화를 인풋 받아서 달러를 반환하는 메소드), 메소드 이름 : toDollar()
	double toDollar(double won) {
		return won / rate;
	}

	// 4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당.
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}

public class Converter_Test {

	public static void main(String[] args) {
		
		// 네이버를 검색해서 오늘 환률을 알아와서
		// 객체 생성 후 스캐너로 환률을 인풋 받아서 setRate() 메소드에 저장 후
			// 원환 100만원 --> 몇 $ 인지 출력
			// 달러 $100 --> 몇 만원 인지 출력
		
		Scanner sc = new Scanner (System.in);
		Converter c1 = new Converter ();
		
		System.out.println("달러 - 원 환율을 입력하세요. >>>");
		
		c1.setRate(sc.nextDouble());
		
//		double rate = sc.nextDouble();
//		c1.setRate(rate);
		
		System.out.println(c1.getRate());
		
		System.out.println("====100달러 -> 만원====");

		System.out.println("$100 : " + (c1.toKWR(100)/10000) + "만원");
		
		System.out.println("====100만원 -> 달러====");
		
		System.out.println("100만원 : " + c1.toDollar(1000000) + "달러");
		
		// printf() 를 사용해서 출력
		System.out.println("==소수점 2번째 자리까지 잘라서 출력 (printf() ==");
		
		System.out.printf("$100 : %.2f 만원\n", c1.toKWR(100)/1000);
		System.out.printf("100만원 : %.2f 달러\n", c1.toDollar(1000000));
		
		// 2. 변수에 더블 값을 할당 후 소숫점 2자리까지 변환해서 출력
		
		System.out.println("==========예시===========");
		
		double per1 = 3.141592;
			// String 으로 변환 후 per1 변수의 값을 소숫점 2자리까지 출력 후 다시 더블형으로 변환
		double per2 = Double.parseDouble(String.format("%.2f", per1));
		System.out.println(per2);
		
		System.out.println("==실수를 변수에 할당 후 소숫점 2자리까지 자른 후 다시 더블에 지정==");
		double d2 = c1.toDollar(1000000);			// 실수를 리턴 받아서 d2 할당.
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("100만원 : " + d1 + "달러");
		
		double d4 = c1.toKWR(100)/1000;
		double d3 = Double.parseDouble(String.format("%.2f", d4));
		System.out.println("100달러 : " + d3 + "만원");
		
		sc.close();
		
	}

}
