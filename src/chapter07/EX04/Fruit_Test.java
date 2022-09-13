package chapter07.EX04;

class Fruit {
	
	// 1. 필드
	String name;		// 과일 이름
	String color;		// 과일 색깔
	int count;			// 과일 갯수
	int sugarContent;	// 과일의 당도
	
	// 2. 생성자
	Fruit () {}			// 기본 생성자
	Fruit (String name, String color, int count, int sugarContent) {
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugarContent = sugarContent;
	}
	
	// 3. show(); : 필드의 값을 모두 출력하는 메소드
	void show () {
		System.out.println(name + ", " + color + ", " + count + ", " + sugarContent);
	}
	
	// 4. getter / setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
}

public class Fruit_Test {

	public static void main(String[] args) {
		
		// 1. 바나나 객체 생성 후 필드에 기본값을 직접 입력 후 / 직접 출력
		Fruit banana = new Fruit ();
		
		banana.name = "바나나";
		banana.color = "노란색";
		banana.count = 20;
		banana.sugarContent = 8;
		
		System.out.println(banana.name + ", " + banana.color + ", " + banana.count + ", " + banana.sugarContent);
		
		System.out.println("================================");
		
		// 2. 사과 객체 : 생성자를 통해서 4개의 필드에 초기값을 할당. show() 출력
		Fruit apple = new Fruit ("사과", "빨간색", 12, 7);
			// show() 메소드 호출해서 출력
		apple.show();
		
		System.out.println("================================");

		// 3. 딸기 객체 : setter를 사용해서 4개의 필드에 값 할당. getter 사용해서 출력
		Fruit strawberry = new Fruit ();
		
		strawberry.setName("딸기");
		strawberry.setColor("빨간색");
		strawberry.setCount(30);
		strawberry.setSugarContent(6);
		
		System.out.print(strawberry.getName() + ", ");
		System.out.print(strawberry.getColor() + ", ");
		System.out.print(strawberry.getCount() + ", ");
		System.out.print(strawberry.getSugarContent());
		
	}

}
