package chapter04.EX04;

public class Using_For04 {

	public static void main(String[] args) {
		
		// 이중 for 문 사용하기
		
		for (int i=1 ; i<=5 ; i++) {										// 5번 반복 : 0, 1, 2, 3,
			for (int j=1 ; j<=10 ; j++) {								// 10번 반복
				System.out.println("i : " + i + ", j : " + j);
			}
			System.out.println();
		}

	}

}
