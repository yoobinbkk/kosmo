package basic3;

public class EX01_함수2 {

	public static void main(String[] args) {
		
		int sum = add();
		// 합을 여기서 출력해야 함
		System.out.println("합 : " + sum);
		
	}
	
	static int add () {
		int a = 10, b =20;
		int sum = a + b;
		return sum;
	}

}
