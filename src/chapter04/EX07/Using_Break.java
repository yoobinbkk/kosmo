package chapter04.EX07;

public class Using_Break {

	public static void main(String[] args) {
		
		// break;  <-- 해당 구문({})을 탈출할 때 사용, if 조건과 같이 사용
		//		- 1단계만 탈출
		// for, while, do while (반복문을 탈출할 때 사용), 
		
		// 1. 단일 loop에서 탈출
		for (int i=0 ; i<10 ; i++) {
			System.out.println(i);
			break;												// 한 단계 탈출
		}
		
		System.out.println("=====================");
		
		// break는 for, while, do while 내에서 if 조건문과 같이 사용
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i);
			if (i==5) {break;}									// i가 5일 때 탈출
		}
		
		System.out.println();
		System.out.println("=====================");
		
		// 2. 다중 loop 문에서 break 사용
		//		case 1. 하나의 loop문만 탈출
		
		for (int i=0 ; i<5 ; i++) {								// 0~4 : 5번 loop
			for (int j=0 ; j<5 ; j++) {							// 0~4 : 5번 loop
				if (j==2) {break;}								// 하나의 for 문만 빠져나감
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("=====================");
		
		// case 2. 한꺼번에 탈출 (바깥쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출)
		for (int i=0 ; i<5 ; i++) {
			for (int j=0 ; j<5 ; j++) {
				if (j==2) {
					i = 100;									// 바깥쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출
					break;}
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("=======이중 for문 타출 (label)========");
		
		// case 2. 한꺼번에 탈출 (label를 사용해서 탈출)
		jump: for (int i=0 ; i<5 ; i++) {
			for (int j=0 ; j<5 ; j++) {
				if (j==2) {break jump;}							// 첫 번째 jump의 위치로 넘어감
				System.out.println(i + ", " + j);
			}
		}

	}

}
