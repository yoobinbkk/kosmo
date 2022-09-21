package basic3;

public class EX09_AsumTest {

	public static void main(String[] args) {
		
		int sum = sumFunc(10);
		System.out.println("합 : " + sum);
		
		
		hello(0);
		
	}
	
	static int sumFunc(int i) {
		// sum = 1 + 2 + 3
		if (i==1) return 1;
		return i + sumFunc(i-1);		// 제기연산
	}	
		
	static void hello(int i) {
		if (i==10) return;
		System.out.println((i+1) + "번째 Hello");
		hello(++i);
	}

}
