package chapter10.EX01;

class Fruit {			// 과일 <-- 부모 클래스
	String name;		// 과일 이름
	String color;		// 과일 색깔
	int size;			// 과일 크기
	
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name + ", " + color + ", " + size);
	}
}

// 자식 클래스만 가지는 필드 1, 메소드 1
class Apple extends Fruit {			// 사과 <-- 자식 클래스
	int applecount;
	void show () {
		System.out.println("사과의 갯수 : " + applecount);
	}
}

class Orange extends Fruit {			// 오렌지 <-- 자식 클래스
	int orangecount;
	void show () {
		System.out.println("오렌지의 갯수 : " + orangecount);
	}
}

class Banana extends Fruit {			// 바나나 <-- 자식 클래스
	int bananacount;
	void show () {
		System.out.println("오렌지의 갯수 : " + bananacount);
	}
}

public class Using_Inheritance02 {

	public static void main(String[] args) {
		
		System.out.println("=====과일======");
		
		Fruit f = new Fruit();
		f.name = "두리안";
		f.color = "녹색과 노란색";
		f.size = 9;
		
		f.eat();
		f.print();
		
		System.out.println("=====사과======");
		
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨간색";
		a.size = 3;
		a.applecount = 30;
		
		a.print();
		a.show();
		
		System.out.println("=====오렌지======");
		
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황색";
		o.size = 3;
		o.orangecount = 50;
		
		o.print();
		o.show();
		
		System.out.println("=====바나나======");
		
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노란색";
		b.size = 5;
		b.bananacount = 70;
		
		b.print();
		b.show();

		
	}

}
