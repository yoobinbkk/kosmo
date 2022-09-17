package chapter10.EX09;

public class VIP_Customer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	VIP_Customer () {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
	VIP_Customer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
	// 상속된 부분은 Customer의 필드
	// (상속해서) 덮어쓰기 된 부분은 customerGrade, bonusRatio
	// bonusPoint는 여기서 처음 사용됨
	
}
