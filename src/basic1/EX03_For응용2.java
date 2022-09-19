package basic1;

public class EX03_For응용2 {

	public static void main(String[] args) {
		
		// for 문을 자유롭게 출력하는 연습
		
		// 1. A~Z까지 알파펫의 개수(26)만큼 출력하기
//		for (int i=0 ; i<26 ; i++ ) {
//			for (char j='A' ; j<='Z' ; j++) System.out.print(j);
//			System.out.println();
//		}
		
		// 2. Z~A까지 알파펫의 개수(26)만큼 출력하기
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='Z' ; j>='A' ; j--) System.out.print(j);
//			System.out.println();
//		}
		
		// 3. 한 줄에 A부터 순차적으로 출력
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='A' ; j<='A'+i ; j++) System.out.print(j);
//			System.out.println();
//		}
		
		// 4. 한 줄에 Z부터 순차적으로 출력
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='Z' ; j>='Z'-i ; j--) System.out.print(j);
//			System.out.println();
//		}
		
		// 5. A~Z에서 Z부터 줄여나가기
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='A' ; j<='Z'-i ; j++) System.out.print(j);
//			System.out.println();
//		}
		
		// 6. A~Z에서 A부터 줄여나가기
//		for (int i=0 ; i<26 ; i++) {
//			for (char j= (char) ('A'+i) ; j<='Z' ; j++) System.out.print(j);
//			System.out.println();
//		}
		
		// 7. A~Z에서 Z부터 역순으로 출력하기
//		for (int i=25 ; i>=0 ; i--) {
//			for (int k=0 ; k<i ; k++) System.out.print(" ");
//			for (char j= (char)('A'+i) ; j<='Z' ; j++) System.out.print(j);
//			System.out.println();
//		}
		
		// 8. Z~A에서 A부터 역순으로 출력하기
//		for (int i=25 ; i>=0 ; i--) {
//			for (int j=0 ; j<i ; j++) {System.out.print(" ");}
//			for (char k=(char)('Z'-i) ; k>='A' ; k--) {System.out.print(k);}
//			System.out.println();
//		}
		
		// 9. Z~A에서 Z부터 줄여나가기
//		for (int i=0 ; i<26 ; i++) {
//			for (char j=(char)('Z'-i) ; j>='A' ; j--) System.out.print(j);
//			System.out.println();
//		}
//		
		// 10. Z~A에서 A부터 줄여나가기
//		for (int i=0 ; i<26 ; i++) {
//			for (char j='Z' ; j>='A'+i ; j--) System.out.print(j);
//			System.out.println();
//		}
		
		// 11. A~Z에서 A부터 줄여나가는데 빈 자리를 공백으로 채울 것
		
		// 12. A~Z에서 Z부터 줄여나가는데 빈 자리를 공백으로 채울 것
		
	}

}
