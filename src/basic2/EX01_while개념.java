package basic2;

public class EX01_while개념 {
	
	public static void main(String[] args) {
		
		// 0. for 문
		// 1-10까지 합
//		int sum = 0;									// 합의 변수를 따로 선언
//		for (int i=1 ; i<=10 ; i++) {					// 1부터 10까지 1씩 더한다.
//			sum += i;									// 각각의 i를 더한다.
//		}
//		System.out.println("1~10까지의 합 : " + sum);
		
		// 1. while
//		int sum = 0;
//		int i = 1;							// 변수의 초기값은 while 문 바깥에
//		while (i<=10) {						// while 문에는 조건문만 있다.
//			sum += i;							// 실행할 내용
//			i++;							// 변수의 초기값은 while 문 안에서 설정
//		}
//		System.out.println("합 : " + sum);
		
		// 2. do while
		int sum = 0;
		int i=1;
		do {
			sum += i;
			i++;
		} while (i<=10);
		System.out.println("합 : " + sum);
		
		// 3. 
		
		
	}

}
