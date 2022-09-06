package chapter04;

public class If_01 {

	public static void main(String[] args) {
		
		/*
			제어문 : 프로그램의 순서를 바꾸는 구문 
			 - 선택 제어문 : if , switch
			 - 반복 제어문 : for , while, do while;
			
			if : 조건을 만족하는 실행문을 실행 후 if 문을 빠져나온다.
					(break를 사용하지 않더라도 if 문을 빠져나온다.
					 switch 문은 break를 사용해서 구문을 빠져나온다.)
			
			 - if (조건) { 실행문1 } ;		// 조건이 참일 때 실행문1 을 실행
			 - if (조건) {
			 		실행문1 ;				// 실행문1 : 조건이 참일 때
			 	} else {
			 		실행문2 ;				// 실행문2 : 조건이 거짓일 때
			 	}
			 	
			  - if (조건) {				// 조건1 이 참일 때, 실행문1을 실행
			  		실행문1 ;
			  	} else if (조건) {		// 조건2 가 참일 때, 실행문2를 실행
			  		실행문2 ;
			  	} else if (조건) {		// 조건3 이 참일 때, 실행문3을 실행
			  		실행문3
			  	} ...
			  	
			  	} else {				// 위의 모든 조건을 만족하지 않을 때 실행문 10을 실행
			  		실행문n ;
			  	}
		*/
		
		
		// if (조건) { 실행문1 }
		
		System.out.println("=============조건이 false===============");
		if (3 > 5) {	// 조건이 false이므로 실행문 내의 구문은 실행되지 않는다.
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		System.out.println("=============조건이 true===============");
		
		if (3 < 5) {	// 조건이 true이므로 실행문 내의 구문은 실행된다.
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		System.out.println("============================");
		
		// 1. if 조건에서 실행문이 한 개일 때는 중괄호를 생략할 수 있다. (주의 요함)
		
		if (true) // {
			System.out.println("안녕하세요.");
		// }
		
		if (false)
			System.out.println("오늘은 비가 옵니다.");		// 중괄로 생략
			System.out.println("비가 보슬보슬 옵니다.");		// 중괄로 밖의 실행구문
		
		System.out.println("============================");
			
		/* 2. if (조건) {
				실행문1 ;		// 조건이 참일 때, 실행문1 실행
			  } else {
			  	실행문2 ;		// 조건이 거짓일 때, 실행문2 실행
			  }
		*/
			
		if (true) {
			System.out.println("실행1 (참)");			// 조건이 참일 때 실행
		} else {
			System.out.println("실행2 (거짓)");		// 조건이 거짓일 때 실행
		}
		
		/* 변수 선언 : 동일한 변수를 여러 개 선언 시 , 로 구분
				- 기본 자료형 (8가지) : 초기값을 할당하지 않으면 오류
					boolean, byte, short, int, long, float, double, char
				- 참조 자료형 (무한대) : 초기값을 할당하지 않으면 컴파일러가 자동으로 넣어줌
					String(문자열)
		*/
		
		int a, b;					// 변수 선언만 한 경우
		
		//System.out.println(a);			// 변수의 값을 넣지 않고 출력하면 오류
		
		a = 5; b = 0;						// 변수에 초기값 할당.
		if (a > 5) {
			b = 10;
		} else {
			b = 20;
		}
		System.out.println(b);				// 20
		
		// if (조건) ~ else 구문을 삼항 연산자로 변환 : 삼항 연산자는 한 라인으로 처리
		System.out.println("==============삼항 연산자 출력==============");
		System.out.println((a > 5)? 10:20);
		
		System.out.println("============================");
		
		/*3. 조건이 여러 개인 경우 : if (조건) ~ else if (조건) ~ else 구문
		 *		: 해당 조건을 만족하는 실행문을 실행 후 if문 탈출
		 */
		
		int c;
		c = 85;
		
		if (c >= 90) {								// false
			System.out.println("A학점입니다.");
		} else if (c >= 80) {						// true
			System.out.println("B학점입니다.");			// 실행문 실행 후 if문을 빠져나옴
		} else if (c >= 70) {
			System.out.println("C학점입니다.");
		} else if (c >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("학점 미달입니다.");
		}
		
		System.out.println("if 문 탈출됨");
		
		

	}

}
