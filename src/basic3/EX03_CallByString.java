package basic3;

public class EX03_CallByString {

public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("Hi");
		
		add(a, b);
		System.out.println("A = " + a + ", B = " + b);		// A = 안녕, B = Hi
		
	}
	
	static void add(String a, String b) {
		a += b;
		System.out.println("A = " + a + ", B = " + b);		// A = 안녕Hi, B = Hi
	}

}
