package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		
		// continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		
		// 1. 단일 loop에서 continue
		for (int i=0 ; i<10 ; i++) {						// 0~9 : 10번
			System.out.print("A");
			{continue;}										// continue = {} , 다시 실행문으로 올라가서 처리
			//System.out.println("B");						// 도달할 수 없는 코드
		}
		
		System.out.println();
		System.out.println("===================");
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print("A");
			if (i%2 == 0) {continue;}						// i : 0, 2, 4, 6, 8,
			System.out.print("B");
		}
		
		System.out.println();
		System.out.println("===================");
		
		for (int i=0 ; i<10 ; i++) {
			if (i==5 || i==7) {continue;}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		// for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3의 배수만 출력하세요.
		for (int i=1 ; i<=1000 ; i++) {
			if (i%3 != 0) {continue;}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		// for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 5의 배수만 출력하세요.
		for (int i=1 ; i<=1000 ; i++) {
			if (i%5 != 0) {continue;}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		// for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 7의 배수만 출력하세요.
		for (int i=1 ; i<=1000 ; i++) {
			if (i%7 != 0) {continue;}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		// for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3, 5, 7의 배수만 출력하세요.
		for (int i=1 ; i<=1000 ; i++) {
			if (i%3 == 0 || i%5 == 0 || i%7 == 0) {
			System.out.print(i + " ");
			} else {continue;}
		}
		
		System.out.println();
		System.out.println("===================");
		
		for (int i=1 ; i<=1000 ; i++) {
			if (i%3 == 0 || i%5 == 0 || i%7 == 0) {
				for (int j=1 ; j<=9 ; j++) {
					System.out.printf("%d * %d = %d \t", i, j, (i*j));
				}
				System.out.println();
			}
		}
		
		// 2. 다중 Loop에서 continue
		for (int i=1 ; i<=5 ; i++) {
			for (int j=1 ; j<=5 ; j++) {
				if (j==3) {continue;}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println("=========label를 사용해서 점프함.==========");
		
		out: for (int i=1 ; i<=5 ; i++) {
			for (int j=1 ; j<=5 ; j++) {
				if (j==3) {continue out;}
				System.out.println(i + " , " + j);
			}
		}
		
		System.out.println("============================");
		
		out: for (int i=1 ; i<=5 ; i++) {
			for (int j=1 ; j<=5 ; j++) {
				if (j==3) {
					i = 100;												// 바깥쪽 for 문의 변수값을 중대시켜서 false 빠져나옴
					continue out;}
				System.out.println(i + " , " + j);
			}
		}

	}

}
