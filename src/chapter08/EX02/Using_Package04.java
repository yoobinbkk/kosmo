package chapter08.EX02;

// import 시 * 를 사용하는 경우 : 해당 패키지의 모든 클래스를 import
//			* : 패키지의 모든 클래스만 적용. 하위의 패키지는 적용되지 않는다.

import chapter08.EX01.*;				

public class Using_Package04 {

	public static void main(String[] args) {
		
		// A 클래스 객체 생성
		A a = new A();
//		B b = new B();		// 오류 : default
		C c = new C();
//		D d = new D();		// 오류 : 하위 패키지는 import를 못함
		
		
	}

}
