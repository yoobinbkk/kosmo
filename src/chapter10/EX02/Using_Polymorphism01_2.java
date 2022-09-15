package chapter10.EX02;

class Animal {
	String name = "동물";
}

class Person extends Animal {
	String personName = "사람";
}

class Child extends Person {
	String pName = "아이";
}

public class Using_Polymorphism01_2 {

	public static void main(String[] args) {
		
		// 1. Animal 객체 생성
			// Animal 객체는 Animal 타입만 내포
		Animal a1 = new Animal();
		System.out.println(a1.name);
		
		// 2. Person 객체 생성 Animal 타입 생성
			// a2는 Animal, Person 타입을 내포하고 있고, Animal 타입으로 지정
			// Animal 타입의 필드, 메소드만 접근 가능, Person 타입으로 다운캐스팅이 가능
		Animal a2 = new Person();
		System.out.println(a2.name);
//		System.out.println(a2.personName);				// 오류
		
			// a2는 Person 타입으로 다운 캐스팅 (Animal, Person 필드, 메소드 모두 접근)
		Person p1 = (Person) a2;
		System.out.print(p1.name + " ");
		System.out.println(p1.personName);
		
		// 3. Person 객체를 Person 타입으로 생성 (Animal, Person 필드, 메소드 모두 접근)
		Person p2 = new Person();
		System.out.print(p2.name + " ");
		System.out.println(p2.personName);
		
			// 업캐스팅
		Animal a3 = p2;						// a3는 Animal, Person을 내포하고 있고, Animal 타입으로 지정
		System.out.println(a3.name);
//		System.out.println(a3.personName);				// 오류
			// 다운캐스팅
		Person p3 = (Person) a3;			// p3는 Animal, Person을 내포하고 있고, Person 타입으로 지정
		System.out.print(p3.name + " ");
		System.out.println(p3.personName);

		// 4. Child 객체를 Animal 타입으로 생성
			// a4는 Animal, Person, Child 타입을 내포하고 있고, Animal 타입으로 지정
			// Animal 타입의 필드와 메소드만 접근
		Animal a4 = new Child();
		System.out.println(a4.name);
		
		// 다운 캐스팅
		Child pp1 = (Child) a4;
		System.out.print(pp1.name + " ");
		System.out.print(pp1.personName + " ");
		System.out.println(pp1.pName);
		
		// 5. Child 객체를 Child 타입으로 생성
		Child pp2 = new Child();
		System.out.print(pp2.name + " ");
		System.out.print(pp2.personName + " ");
		System.out.println(pp2.pName);
		
		// 6. Child 객체를 Person 타입으로 생성
			// p10은 Animal
		Person p10 = new Child();
		System.out.print(p10.name + " ");
		System.out.println(p10.personName);
		
	}

}
