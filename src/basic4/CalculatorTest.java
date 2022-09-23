package basic4;

import java.util.Scanner;
import java.util.StringTokenizer;

class CalculatorExpr {
	
	// 필드 (연산할 두 숫자)
	private int num1;
	private int num2;
	
	// 두 숫자를 더하는 메소드
	int getAddition () {
		return num1+num2;
	}

	// 두 숫자를 서로 빼는 메소드
	int getSubtraction () {
		return num1-num2;
	}

	// 두 숫자를 곱하는 메소드
	int getMultiplication () {
		return num1*num2;
	}
	
	// 두 숫자를 서로 나누는 메소드
	double getDivision () {
		return num1/num2;
	}

	// 두 숫자의 getter 와 setter
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
	
	// 입력 받은 두 숫자를 배열에 넣어 반환하는 메소드
	static int[] twoNumInput (String input) {
		// 임시 배열을 생성
		int[] tempArr = new int[2];

		// StringTokenizer로 입력값을 나누어 배열에 넣기
		StringTokenizer tk1 = new StringTokenizer (input, ",");
		for (int i=0 ; tk1.hasMoreTokens() ; i++) {
			String tk2 = tk1.nextToken();
			tempArr[i] = Integer.parseInt(tk2);			// 나누어진 String 값을 정수로 바꾸고 tempArr 배열에 넣기
		}
		return tempArr;			// 두 숫자가 들어있는 배열을 반환
	}

	public static void main(String[] args) {

		// CalculatorExpr 클래스의 객체 생성
		CalculatorExpr s1 = new CalculatorExpr();

		System.out.println("사칙연산할 두 숫자를 입력하세요 (예:2,2) >>>");

		// 두 숫자를 입력값으로 받아오기
		Scanner input = new Scanner (System.in);
		String twoNum = input.nextLine();
		
		// 메소드로 불러온 배열의 값을 setNum1 과 setNum2에 넣기
		s1.setNum1(twoNumInput(twoNum)[0]);
		s1.setNum2(twoNumInput(twoNum)[1]);

		// 입력값을 메소드로 계산에서 출력하기
		System.out.println("덧셈 : " + s1.getAddition());
		System.out.println("뺄셈 : " + s1.getSubtraction());
		System.out.println("곱셈 : " + s1.getMultiplication());
		System.out.println("나눗셈 : " + s1.getDivision());

		// do-while 문
		do {
			System.out.println("계속 진행하시겠습니까? 진행하신다면 Y를 입력하시고 종료하시려면 N을 입력하세요>>>");
			String yOrN = input.nextLine();																// 새로운 입력값을 받아 사칙연산을 다시 진행할 건지 묻는다
			if (yOrN.toLowerCase().equals("y")) {														// 만약 진행한다면 y 입력
				
				System.out.println("사칙연산할 두 숫자를 입력하세요 (예:2,2) >>>");
				
				// 두 숫자를 입력값으로 받아오기
				String twoNum2 = input.nextLine();
				
				// 메소드로 불러온 배열의 값을 setNum1 과 setNum2에 넣기
				s1.setNum1(twoNumInput(twoNum2)[0]);
				s1.setNum2(twoNumInput(twoNum2)[1]);
				
				// 입력값과 메소드를 출력하기
				System.out.println("추출된 숫자 : " + twoNumInput(twoNum2)[0] + ", " + twoNumInput(twoNum2)[1]);
				System.out.println("덧셈 : " + s1.getAddition());
				System.out.println("뺄셈 : " + s1.getSubtraction());
				System.out.println("곱셈 : " + s1.getMultiplication());
				System.out.println("나눗셈 : " + s1.getDivision());
				
			} else if (yOrN.toLowerCase().equals("n")) {											// 만약 종료한다면 n 입력
				System.out.println("[종료]");
				System.exit(0);
			} else {																				// 만약 y 나 n 외에 다른 것을 입력했다면 잘못 입력했다고 알리고 다시 do-while의 첫 줄로 돌아간다
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (true);


	}


}
