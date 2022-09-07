package chapter07.EX01;

class B {
	// 1. 리턴 타입이 없고(void), 입력 매개변수가 없는 메서드
	void print () {
		System.out.println("안녕");
	}
	
	// 2. 리턴 타입 int, 입력 매개변수 없는 메소드
	int data() {
		return 3;								// 3은 반드시 정수이어야 한다.
	}
	
	// 3. 리턴 타입 double, 입력 매개변수 2개인 메소드
	double sum (int a, double b) {
		return a + b;
	}
	
	// 4. 리턴 타입 없음(void), 내부 함수를 종료함 (return;)
		// 메소드 내부에서 return;을 만나면 메소드 종료
	void printMethod (int m) {
		if (m <= 0 || 12 < m) {
			System.out.println("잘못된 입력되어 메소드 종료");
			return;													// 메소드
//			System.out.println("출력되지 않는 부분");						// 도달할 수 없는 코드
		} else {
			System.out.println("입력한 달은 : " + m + " 월입니다.");
		}
	}
	
	boolean call() {							// call() 
		
		return true;
	}
}

public class Using_Method01 {

	public static void main(String[] args) {
		
		// 메서드 사용
		
		// 객체 생성 (b)
		B b = new B();
		b.print();
		System.out.println(b.data());
		System.out.println("==리턴 double, 입력 매개 변수 2개==");
		System.out.println(b.sum(3, 5.5));
		System.out.println("==리턴이 없고 잘못된 입력이 되면 메소드 종료됨==");
		b.printMethod(12);												// 1~12월 외에는 return; 으로 종료
		
		System.out.println(b.call());

	}

}
