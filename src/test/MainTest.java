package test;

public class MainTest {

	public static void main(String[] args) {
		
//		Book a = new Book("나는 군단이다", "나유미", "네이버 시리즈");
//		a.print();
		
		Drawings b = new Drawings();
		
		b.deposit(50000);
		System.out.println(b.balance);
		
		b.withdrawal(120000);
		System.out.println(b.balance);
		
		b.withdrawal(40000);
		
		System.out.println(b.toString());
		
	}

}
