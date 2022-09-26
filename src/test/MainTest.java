package test;

public class MainTest {

	public static void main(String[] args) {
		
		Drawings b = new Drawings();
		
		b.deposit(50000);
		
		b.withdrawal(120000);
		
		b.withdrawal(40000);
		
		System.out.println(b.toString());
		
	}

}
