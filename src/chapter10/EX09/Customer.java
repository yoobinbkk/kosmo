package chapter10.EX09;

public class Customer {
	
	 
	int customerID;					// 고객 아이디
	String customerName;			// 고객 이름
	String customerGrade;			// 고객 등급 (VIP, Gold, Silver)
	int bonusPoint;					// 고객의 등급에 따라서 포인트 적립 
	double bonusRatio;				// 물품 구매 시 할인률
			
	Customer() {
		// 필드의 기본값 할당을 메소드 호출로 적용
		initCustomer();				// this.initCustomer(), 자신 객체의 매소드 호출
	}
	
	Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	void initCustomer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
		

}
