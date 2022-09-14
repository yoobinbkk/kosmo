package chapter08.EX02;

// import를 사용하지 않고 외부 패키지 접근
	// A 클래스 (public) (접근 가능), B 클래스 (default) (접근 불가능)

public class Using_Package03 {

	public static void main(String[] args) {
		
		// 전체 이름 : 패키지명.클래스명
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m);			// 외부 패키지에서 접근 가능 (public)
		System.out.println(a.n);
		a.print();
		
		
		

	}

}
