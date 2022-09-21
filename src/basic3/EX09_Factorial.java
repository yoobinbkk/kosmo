package basic3;

public class EX09_Factorial {

	public static void main(String[] args) {
		
		int input = 5;
		int fact = factorial(input);
		System.out.println(input + "!= " + fact);
		
		
	}
	
	static int factorial(int i) {
		if (i==1) return 1;
		return i * factorial(i-1);
	}

}

/*
	5! = 5*4*3*2*1
*/