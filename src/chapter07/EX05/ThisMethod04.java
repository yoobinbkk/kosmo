package chapter07.EX05;

class Car {
	
	// this 키워드 : 필드나 메서드 선언 시 사용 불가
	//			    - 생성자, 메서드 내부에서 필드나 메서드를 사용할 때 자신의 필드나 메서드를 저장
	//				- 자신의 객체의 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이 사용
	//				- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우
	// this()		- 생성자 내부에서만 사용, 반드시 첫 라인에 위치
	//				- 자신의 객체의 다른 생성자를 호출
	//				- 생성을 오버라이딩할 때, 코드를 간략하게 사용
	String companyName;			// 현대자동차
	String color;				// 검은색
	double maxSpeed;			// 200.0 km/h
	
	// 생성자
	Car () {		// 리턴 타입이 없다, 클래스 이름과 동일
		companyName = "불분명함";			// this 키를 생략 시 자동으로 컴파일러가 할당
		color = "불분명함";
		maxSpeed = 0;
	}
	
	Car (String companyName) {			// 매개변수 이름, 필드 이름이 같을 때
		this();							// this() 메소드 사용, 기본 생성자 호출
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
		
		System.out.println("===================================");
		
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
