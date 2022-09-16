package chapter10.EX07;

class Animal {
	// 자식 클래스에서 2개의 메소드를 오버라이딩
	// Animal 타입으로 정의, 배열에 저장 후, 오버라이딩된 메소드 출력 (for, 향상된 for)
		
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal {
	int count;											// 호랑이의 수
	
	Tiger() {}
	Tiger(int count) {
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 먹습니다.");
	}
}

class Cougar extends Animal {
	int count;											// 쿠거의 수
	
	Cougar() {}
	Cougar(int count) {
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("쿠거는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("쿠거는 먹습니다.");
	}
}

class Deer extends Animal {
	int count;											// 사슴의 수
	
	Deer() {}
	Deer(int count) {
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("사슴은 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("사슴은 먹습니다.");
	}
}

class Dog extends Animal {
	int count;											// 개의 수
	
	Dog() {}
	Dog(int count) {
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("개는 먹습니다.");
	}
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		
		// 1. 객체 생성 (Animal 타입으로 생성)
			// 생성자를 통해서 각각의 필드에 값을 할당
		Animal a1 = new Animal();
		Animal a2 = new Tiger(10);
		Animal a3 = new Cougar(14);
		Animal a4 = new Deer(50);
		Animal a5 = new Dog(70);
			
		// 객체를 배열에 저장
		Animal[] arr1 = new Animal[] {a1, a2, a3, a4, a5};
		
		// For 문을 사용해서 출력 : eat(), run() , 동물의 총 머리수 : 00
			// 1. For 문을 사용해서 객체를 Animal객체로 뽑아서
			// 2. 다운캐스팅해서 자식 필드의 count 읽어서 좀 더한 값을 출력
		
		// 동물의 총 합을 구하는 변수 선언
		int sum = 0;
		for (int i=0 ; i<arr1.length ; i++) {
			// 배열에 각 방에 저장된 객체를 Animal 객체에 저장
			Animal bb1 = arr1[i];
			bb1.eat();							// Animal의 eat() 메소드 : 오버라이딩된 메소드 출력
			bb1.run();							// Animal의 run() 메소드 : 오버라이딩된 메소드 출력
			
			if (bb1 instanceof Tiger) {
				Tiger t = (Tiger) bb1;
				System.out.println("호랑이의 수 : " + t.count);
				sum += t.count;
			}
			if (bb1 instanceof Cougar) {
				Cougar t = (Cougar) bb1;
				System.out.println("쿠거의 수 : " + t.count);
				sum += t.count;
			}
			if (bb1 instanceof Deer) {
				Deer t = (Deer) bb1;
				System.out.println("사슴의 수 : " + t.count);
				sum += t.count;
			}
			if (bb1 instanceof Dog) {
				Dog t = (Dog) bb1;
				System.out.println("개의 수 : " + t.count);
				sum += t.count;
			}
		}
		System.out.println("동물의 총 머리수 : " + sum);
	}
}
