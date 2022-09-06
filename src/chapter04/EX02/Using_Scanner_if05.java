package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		  	스케너를 나이를 인풋 받아서 출력 :
			나이(age) 가 8세 미만이면 : "취학 전 아동 입니다"
								   "입장료는 <1000>원 입니다.
			나이 14세 미만이면 : "초등학생 입니다."
							 "입장료는 <2000>원 입니다.
			나이 20세 미만이면 : "중, 고등학생 입니다."
							 "입장료는 <2500>원 입니다.
			나이 20세 이상이면 : "일반인 입니다."
							 "입장료는 <3000>원 입니다.
		*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("나이를 입력해주세요. (0~100) >>>");
		
		int age = sc.nextInt();
		
		String grade = "";
		int price = 0;
		
		if (age < 8) {
			price = 1000;
			grade = "취학 전 아동";
		} else if (age >= 8 && age < 14) {
			price = 2000;
			grade = "초등학생";
		} else if (age >= 14 && age < 20) {
			price = 2500;
			grade = "중, 고등학생";
		} else {
			price = 3000;
			grade = "일반인";
		}
		
		System.out.printf("%s 입니다.", grade);
		System.out.printf("입장료는 %d원 입니다.", price);
		
		
		sc.close();

	}

}
