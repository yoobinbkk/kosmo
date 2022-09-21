package basic3;

public class EX01_함수3 {

	public static void main(String[] args) {
		
		int[] arr = add();									// 여기서 함수를 선언한다.
		// a와 b 값을 받아서 합한 결과를 여기서 출력
		
		int sum = arr[0] + arr[1];
		System.out.println("합 : " + sum);
		
	}
	
	static int[] add() {									// static이어야만 main에 값을 return할 수 있다.
		int a = 10, b = 20;									
		int [] arr = {a, b};				// 배열에 값을 넣고
		return arr;							// 배열을 return한다.
		
		// 
		
	}

}
