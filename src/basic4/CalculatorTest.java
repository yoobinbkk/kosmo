package basic4;

import java.util.Scanner;

class CalculatorExpr {

	private int num1;
	private int num2;

	int getAddition () {
		return num1+num2;
	}

	int getSubtraction () {
		int temp = 0;
		return temp-num1-num2;
	}

	int getMultiplication () {
		return num1*num2;
	}

	double getDivision () {
		return num1/num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}



}

public class CalculatorTest {

	public static void main(String[] args) {

		CalculatorExpr s1 = new CalculatorExpr();
		
		Scanner input = new Scanner (System.in);

		s1.setNum1(2);
		s1.setNum2(2);

		System.out.println("덧셈 : " + s1.getAddition());
		System.out.println("뺄셈 : " + s1.getSubtraction());
		System.out.println("곱셈 : " + s1.getMultiplication());
		System.out.println("나눗셈 : " + s1.getDivision());

		System.out.println("계속 진행하시겠습니까? 진행하신다면 Y를 입력하시고 종료하시려면 N을 입력하세요>>>");

		do {
			String yOrN = input.next();
			if (yOrN.toLowerCase() == "y") {
				
			} if (yOrN.toLowerCase() == "n") {
				System.out.println("[종료]");
				System.exit(0);
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (true);


	}


}
