package chapter07.EX05;

class Car {
	
	String companyName;			// 현대자동차
	String color;				// 검은색
	double maxSpeed;			// 200.0 km/h
	
	// 생성자
	Car () {
		companyName = "불분명함";
		color = "불분명함";
		maxSpeed = 0;
	}
	
	Car (String companyName) {
		this();
		this.companyName = companyName;
	}
	
	Car (String companyName, String color) {
		this(companyName);
		this.color = color;
	}
	
	Car (String companyName, String color, double maxSpeed) {
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	
	// 필드의 모든 값을 출력 메소드 (print())
	void print () {
		System.out.println("자동차 회사 이름 : \t" + companyName);
		System.out.println("자동차의 색깔 : \t" + color);
		System.out.println("자동차의 최대 속력 : \t" + maxSpeed + " km/h");
	}
}

public class ThisMethod04 {

	public static void main(String[] args) {
		
		// this keyword, this Method를 사용해서 처리.
		
		// 1. 매개 변수가 0개일 때, 기본 필드의 값 출력
		Car car1 = new Car ();
		car1.print();
		
		System.out.println("===================================");
		
		// 2. 매개 변수 1개일 때, companyName만 출력, 나머지는 기본값 출력
		Car car2 = new Car ("현대자동차");
		car2.print();
		
		System.out.println("===================================");
		
		// 3. 매개 변수 2개일 때
		Car car3 = new Car ("현대자동차", "검정색");
		car3.print();
		
		System.out.println("===================================");

		// 4. 매개 변수 3개일 때
		Car car4 = new Car ("현대자동차", "검정색", 200);
		car4.print();		

	}

}
