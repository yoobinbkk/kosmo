package chapter08.EX01;

public class Using_Package01 {

	public static void main(String[] args) {
		
		// A class와 같은 패키지에 존재 : import 없이 바로 접근이 가능
		
		System.out.println("==A 클래스 접근(public)==");
		A a = new A();
		
		System.out.println(a.m);			// 접근 가능
		System.out.println(a.n);			// 접근 가능
		a.print();							// 접근 가능
		
		System.out.println("==B 클래스 접근==");
		// 동일한 패키지에 존재
		B b = new B();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();
		
	}

}
