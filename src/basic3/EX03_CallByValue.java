package basic3;

public class EX03_CallByValue {

	public static void main(String[] args) {
		
		int a = 10, b=20;	// 1
		add(a,b);			// 2
		System.out.println("A = " + a + ", B = " + b);		// a=10, b=20	// 5
		
	}
	static void add(int a, int b) {	// 3
		a += b;		// a=30, b=20
		System.out.println("A = " + a + ", B = " + b);		// a=30, b=20	// 4
	}
	
	// 메소드는 main에 영향을 주지 않는다.

}
