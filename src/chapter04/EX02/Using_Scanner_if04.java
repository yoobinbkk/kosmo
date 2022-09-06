package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		
		// 에스프레소, 카페라떼, 아보카도 주문할 경우 가격이 3,500원
		// 아메리카노를 주문할 경우 : 2,500원
		// 그 외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다.
		
		// 출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		//		우리 매장에 없는 메뉴입니다.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("========================================");
		System.out.println("아메리카노 에스프레소 아포카도 카페라떼");
		System.out.println("========================================");
		System.out.println("주문할 커피 메뉴를 고르세요.");
		
		String order = sc.next();
		
//		if (order.equals("아메리카노")) {
//			System.out.println("주문하신 <아메리카노>는 가격이 <2,500>원 입니다.");
//		} else if (order.equals("에스프레소")) {
//			System.out.println("주문하신 <에스프레소>는 가격이 <3,500>원 입니다.");
//		} else if (order.equals("카페라떼")) {
//			System.out.println("주문하신 <카페라떼>는 가격이 <3,500>원 입니다.");
//		} else if (order.equals("아보카도")) {
//			System.out.println("주문하신 <아보카도>는 가격이 <3,500>원 입니다.");
//		} else {
//			System.out.println("우리 매장에 없는 메뉴입니다.");
//		}
		
		int price = 0;
		
		if (order.equals("아메리카노")) {
			price = 2500;
//			System.out.printf("주문하신 %s는 가격이 <%d>원 입니다." , order, price);
		} else if (order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아보카도")) {
			price = 3500;
//			System.out.printf("주문하신 %s는 가격이 <%d>원 입니다." , order, price);
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		
		System.out.printf("주문하신 %s는 가격이 <%d>원 입니다." , order, price);
		
		
		sc.close();

	}

}
