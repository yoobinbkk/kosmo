package chapter07.EX04;

class Car {
	
	// 1. 필드
	String company;				// 제조회사
	String model;				// 자동차 모델
	String color;				// 자동차 색깔
	double maxSpeed;			// 자동차 최대 속력
	
	// 2. 생성자
	Car () {}
	Car (String company, String model, String color, double maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 메소드 (show() : 필드의 값을 출력)
	void show() {
		System.out.println(company + ", " + model  + ", " + color  + ", " + maxSpeed);
	}
	
	// 4. 메소드 (getter/setter)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}

public class Car_Test {

	public static void main(String[] args) {
		
		// 객체 생성
		// car1		현대자동차 그랜져		<-- 필드의 값을 직접 입력 / 출력
		Car car1 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "그랜저";
		car1.color = "검정색";
		car1.maxSpeed = 194;
		
		System.out.println(car1.company + ", " + car1.model  + ", " + car1.color  + ", " + car1.maxSpeed);
		
		System.out.println("========================================");
		
		// car2		쌍용자동차 체어맨		<-- 생성자를 통해서 값 입력 / show() 값 출력
		Car car2 = new Car ("썅용자동차", "체어맨", "회색", 220);
		
		car2.show();
		
		System.out.println("========================================");
		
		// car3		기아자동차 k9		<-- setter를 통해서 값 입력 / getter를 통해서 값 출력.
		Car car3 = new Car ();
		
		car3.setCompany("기아자동차");
		car3.setModel("K9");
		car3.setColor("하얀색");
		car3.setMaxSpeed(254);
		
		System.out.println(car3.getCompany() + ", " + car3.getModel() + ", " + car3.getColor() + ", " + car3.getMaxSpeed());

	}

}
