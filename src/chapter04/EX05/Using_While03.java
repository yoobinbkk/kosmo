package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {
	
	public static void main(String[] args) {
		
		// "그만"할 때까지 정수값을 넣어서 합계와 평균을 출력
		
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		int count = 0;
		int a = 0;
		
		System.out.println("합계와 평균을 알아보기 위해서 정수를 입력하세요. 그만이라고 입력하시면 출력됩니다. >>>");
		
		String type;
		
		while (true) {
			type = sc.next();
			if (type.equals("그만")) {
				break;
			} else {
				a = Integer.parseInt(type);
				sum += a;
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("입력된 정수가 없습니다.");
		} else {
			System.out.println("입력된 정수는 : " + count + " 개입니다.");
			System.out.println("입력된 정수의 합은 : " + sum + " 입니다.");
			System.out.println("평균은 : " + sum / (double) count);
		}
		
		sc.close();
		
	}

}
