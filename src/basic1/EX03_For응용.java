package basic1;

public class EX03_For응용 {

	public static void main(String[] args) {
		
		// 알파벳 'A'~'Z'
//		for (int j=0 ; j<26 ; j++) {						// 여기서부터 시작
//			System.out.print((j+1) + ") ");
//			for (char i='A' ; i<='Z' ; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		// 연습 for 문 극복하기
		// 문제 1
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='A' ; j<='A'+i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// 문제 2
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='A' ; j<='Z'-i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// or

//		for (int i=25 ; i>=0 ; i--) {
//			for (char j='A' ; j<='A'+i ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// 문제 3
//		for (int i=0 ; i<26 ; i++) {
//			for (char j= (char) ('A'+i) ; j<='Z' ; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// 문제 4
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='Z' ; j>='Z'-i ; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// 문제 5
//		for (int i=0 ; i<26 ; i++) {
//			for (int k=0 ; k<i ; k++) System.out.print(" ");
//			for (char j = (char) ('A'+i) ; j<='Z' ; j++) System.out.print(j);
//			System.out.println();
//		}

		
	}

}
