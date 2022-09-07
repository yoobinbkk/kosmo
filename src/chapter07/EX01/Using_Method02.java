package chapter07.EX01;

class Circle {
	
	// 필드
	final double PI = 3.14;
	int radius;
	String name;
	
	// 생성자
	Circle (String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	
	// 메소드
	void call() {
		double area = PI * radius * radius;
		System.out.printf("%s 의 넓이는 %.1f 입니다.\n", name, area);
	}
	
}

public class Using_Method02 {

	public static void main(String[] args) {

		// 원의 지름을 넣었을 때 전체 넓이를 구하는 객체를 생성 후 출력해 보세요.
		//		피자 : 10 (반지름)
		//		도넛 : 5 (반지름)
		
		// 출력 : <피자>의 넓이는 <00> 입니다.
		// 		 <도넛>의 넓이는 <00> 입니다.
		
		Circle pizza = new Circle("피자", 10);
		pizza.call();
		
		Circle donut = new Circle("도넛", 5);
		donut.call();

		
	}

}
