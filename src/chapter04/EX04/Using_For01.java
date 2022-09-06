package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		
		/*
		 * 		for (초기값 ; 조건 ; 증가값) {
		 * 			실행문1;					<-- 조건이 참일 동안 계속 반복, 거짓이면 for을 빠져나옴
		 * 		}
		 */
		
		// 기본 for 문
		int a ;
		for (a=0 ; a<3 ; a++) {			// (초기값 ; 조건 ; 증가값)
			System.out.println(a);
		}	// 0 --> a++ --> a<0 --> 실행문 --> 1 (반복)
		
		System.out.println("======================");
		
		// 초기값과 증가값에는 ,로 구분해서 여러 개의 변수가 올 수 있다.
		
		int b , c , d;
		for (b=0, c=10, d=20 ; b<5 ; b++, c+=2, d+=5) {								// b:1씩 증가, c:2씩 증가, d:5씩 증가  <-- b < 5일 때까지
			System.out.println("b : " + b + "c : " + c + "d : " + d);
			// c += 2;																// {}이 안이면 순서 상관없이 증가값이 적용됨
			// d += 5;
		}
		
		System.out.println("======================");
		
		// for 문에서 무한루프 (조건이나 증가값을 잘못 처리할 경우)
		int e;
		for (e=0 ; e<10 ; e+=3) {
			System.out.println(e);													// 조건이 True일 동안 반복
		}
		
		System.out.println("======================");
		
		// for 문 없이 1부터 10까지 덧셈
		int sum1;
		sum1 = 0;					// 0
		sum1 += 1;					// sum1 = sum1 + 1		// 1
		sum1 += 2;					// sum1 = sum1 + 2		// 3
		sum1 += 3;					// sum1 = sum1 + 3		// 6
		sum1 += 4;					// sum1 = sum1 + 4		// 10
		sum1 += 5;					// sum1 = sum1 + 5		// 15
		sum1 += 6;					// sum1 = sum1 + 6		// 21
		sum1 += 7;					// sum1 = sum1 + 7		// 28
		sum1 += 8;					// sum1 = sum1 + 8		// 36
		sum1 += 9;					// sum1 = sum1 + 9		// 45
		sum1 += 10;					// sum1 = sum1 + 10		// 55
		System.out.println("1~10까지의 합 : " + sum1);
		
		// for 문을 사용해서 1부터 10까지의 합계 구하기
		int sum2;
		int i;
		for (i=1, sum2=0 ; i <=10 ; i++) {
			sum2 += i ;
			System.out.println("sum2 : " + sum2 + ", i : " + i);
		}
		System.out.println("1부터 10까지의 합계 : " + sum2);
		
		System.out.println("======================");
		
		// for 문을 사용해서 0 ~ 1000까지 7의 배수만 합계
		// 7의 배수의 합계 : 000
		
		int sum3;
		for (i=0, sum3=0 ; i<1000 ; i+=7) {
			sum3 += i;
			System.out.println("sum3 : " + sum3 + ", i : " + i);
		}
		System.out.println("1~1000까지의 7의 배수만 합계 : " + sum3);
		
		System.out.println("======================");
		
		// for 문과 if 문을 사용해서 1 ~ 10까지 더한 값을 출력하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		
//		int sum4;
//		for (i=1, sum4=0 ; i<=10 ; i++) {
//			sum4 += i;
//			System.out.printf("%d", i);
//				if (i < 10) {
//					System.out.print("+");
//				}
//		}
//		System.out.println(" = " + sum4);
		
		int sum4 = 0;
		for (int ii=1 ; ii <= 10 ; ii++) {
			sum4 += ii;
			System.out.print(ii);					// 더하는 수 출력
			if (ii <= 9) {
				System.out.print(" + ");			// 1~9 까지는 + 출력
			} else {
				System.out.print(" = ");			// i 가 10인 경우 = 출력
				System.out.print(sum4);
			}
		}

	}

}
