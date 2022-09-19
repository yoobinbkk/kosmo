package basic1;

/*
 * 	반복문 : for / while / do~while
 * 
 * 	1. for (초기치; 조건문; 증가치) {
 * 	   반복구문
 * 	   }
 */

public class EX03_For개념 {

	public static void main(String[] args) {
		
		// 1) 1부터 10까지 숫자 출력
//		for (int i=1 ; i<=10 ; i++) {
//			System.out.print(i + " ");
//		}
		
		// 2) 'A' 부터 'Z'까지 출력
//		for (char i = 'A' ; i<='Z' ; i++) {				// 알파벳이나 한글도 작동한다.
//			System.out.print(i + " ");					// A가 작은 숫자 --> Z 큰 숫자
//		}
//		
//		System.out.println();
//		
//		for (char i = 'A' ; i<='Z' ; i+=2) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		// 'Z'부터 'A'까지 출력
//		for (char i = 'Z' ; i>= 'A' ; i--) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
		
		int sum = 0;
		int even = 0;
		int odd = 0;
		
		System.out.print("홀수 출력 : ");
		for (int i=1 ; i<=10 ; i++) {
			sum += i;
			if (i%2 == 0) {
				even += i;
			} else if (i%2 == 1) {
				odd += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("합 : " + sum);
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);

	}

}
