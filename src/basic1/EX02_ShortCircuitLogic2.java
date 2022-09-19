package basic1;

public class EX02_ShortCircuitLogic2 {

	public static void main(String[] args) {
		
		int a = 3;
		
		if (a>3 & ++a>3) {
			System.out.println("조건 만족1");	//  					// a>3 에서 false이니까 ++a>3 이 생략
		}
		System.out.println("a = " + a);		// a = 4
		
		if (a>1 | ++a>3 ) {
			System.out.println("조건 만족2");	// 조건 만족2				// a>1 이 true이니까 ++a>3 이 생략
		}
		System.out.println("a = " + a);		// a = 5
		
		System.out.println("===========================");
		
		a = 3;
		a++;
		
		if (a>3 & ++a>3) {
			System.out.println("조건 만족1");	// 조건 만족1				// 
		}
		System.out.println("a = " + a);		// a = 5
		
		if (a>1 | ++a>3 ) {
			System.out.println("조건 만족2");	// 조건 만족2
		}
		System.out.println("a = " + a);		// a = 6
		
	}

}
