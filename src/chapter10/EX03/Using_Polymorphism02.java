package chapter10.EX03;

class Animal {				// 최상위 부모 클래스
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class Tiger extends Animal {
	// Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int tiger;
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
}

class Eagle extends Animal {
	// Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int eagle;
	void eaglefly() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
}

class Dog extends Animal {
	// Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog;
	void dogCry() {
		System.out.println("개는 멍멍멍 짖습니다.");
	}
}

class Dog_Sub extends Dog {
	// Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	// Dog 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog_sub;
	void dog_subCry() {
		System.out.println("강아지는 낑낑거립니다.");
	}
}

public class Using_Polymorphism02 {

	public static void main(String[] args) {
		
		// 1. Animal 객체를 Animal 타입으로 생성
			// a1은 Animal 타입만 가진다.
				// Animal 클래스의 필드와 메소드만 접근 가능
		Animal a1 = new Animal();

		// 2. Tiger 객체를 Tiger 타입으로 생성
			// t1은 Animal, Tiger를 내포하고 있고, Tiger 타입으로 지정
			// t1은 Animal, Tiger의 필드와 메소드 모두 접근
		Tiger t1 = new Tiger();
		
		// 3. Tiger 객체를 Animal 타입으로 생성 // 업캐스팅
			// a2는 Animal, Tiger를 내포하고 있고, Animal 타입으로 지정
			// a2는 Animal의 필드와 메소드만 접근
		Animal a2 = new Tiger();							// (Animal)이 생략되어 있음
		
		// 4. Dog 객체를 dog 타입으로 생성
			// d1은 Animal, Dog를 내포하고 있고, Dog 타입으로 지정
			// d1은 Animal, Dog의 필드와 메소드 모두 접근
		Dog d1 = new Dog();
		
		// 5. Dog 객체를 Animal 타입으로 생성 // 업캐스팅
			// a3는 Animal, Dog를 내포하고 있고, Animal 타입으로 지정
			// a3는 Animal의 필드와 메소드만 접근
		Animal a3 = new Dog();
		
		// 6. Dog_Sub 객체를 Dog_Sub 타입으로 지정
			// ds1은 Animal, Dog, Dog_Sub 타입을 내포하고 있고, Dog_sub 타입으로 지정
			// ds1은 Animal, Dog, Dog_Sub의 모든 필드와 메소드 접근 가능
		Dog_Sub ds1 = new Dog_Sub();
		
		// 7. Dog_Sub 객체를 Dog 타입으로 지정
			// d2는 Animal, Dog, Dog_Sub 타입을 내포하고 있고, Dog 타입으로 지정
			// d2은 Animal, Dog의 모든 필드와 메소드 접근 가능
		Dog d2 = new Dog_Sub();
		
		//8. Dog_Sub 객체를 Animal 타입으로 지정
			// a4는 Animal, Dog, Dog_Sub를 내포하고 있고, Animal 타입으로 지정
			// a4은 Animal, Dog, Dog_Sub의 모든 필드와 메소드 접근 가능
		Animal a4 = new Dog_Sub();

	}

}
