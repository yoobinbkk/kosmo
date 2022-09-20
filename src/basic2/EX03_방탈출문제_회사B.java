package basic2;

import java.util.Scanner;

public class EX03_방탈출문제_회사B {

	public static void main(String[] args) {
		
		// 1~100,000
		// 3, 6, 9 중 하나라도 있으면 count
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("369가 들어간 수의 갯수를 구합니다. 수를 입력하세요.");
		int num0 = input.nextInt();
		
		int count = 0;
		for (int i=1 ; i<=num0 ; i++) {

			int num = i;
			int num2 = num;
			boolean num369 = false;

			while (num!=0) {
				int rest = num % 10;
				if (rest==3 | rest==6 | rest==9) {
					count++;
					num369 = true;
					System.out.print(num2);
					break;
				}
				num /= 10;
			}
			if (num369==true) {
				if(i==num0) break;
				System.out.printf(", ");
			}
		}
		
		System.out.println("에 숫자 3, 6, 9가 포함되어 총 " + count + "회 손뼉을 칩니다.");
		
	}

}
