package basic3;

public class EX01_함수1 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		add(a, b);		// () 인자
		
	}
	
	static void add(int a, int b) {		// () 파라미터
		// 여기에서 a, b의 값을 합해서 출력
		int sum = a + b;
		System.out.println("합 : " + sum);
		
	}

}
