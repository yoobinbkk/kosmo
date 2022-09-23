/*
	객체지향 언어로서의 자바를 이용하여 프로그램을 작성한다.

    다음 요구사항을 만족하는 은행 계좌 클래스를 정의하여 소스코드를 작성하시고,

    결과화면 스크린 샷의 이미지 파일을 제출하시오

​

   [요구사항]

​

   가. 속성으로 예금주,계좌번호,잔액을 갖는다.

      예금주는 String,계좌번호 String,잔액은 int로 정의하여라

​

   나. 메소드로 인출 및 입금 메소드를 갖는다.

       인출 메소드는 인자로 인출할 금액을 받고 잔액이 부족시에는

       “잔액이 부족합니다”라는 메시지를 잔액이 충분할때는 인출한 금액을 출력하는 

       메소드이다

       입금 메소드는 인자로 입금할 금액을 받고 입금액을 잔액에 더하고

       입금한 금액을 출력하는 메소드이다

​

   다. toString()메소드를 오버라이딩하여 계좌정보 즉 얘금주,계좌번호,잔액을

      출력하는 메소드를 정의하여라

      예 예금주:자바맨, 계좌번호:123-456, 잔액:1000원
 */

package test;

public class Drawings {

	String holder = "홍길동";
	String accountNum = "123-456";
	int balance = 100000;

	Drawings () {}
	
	public void withdrawal (int w) {
		if (w <= balance) {
			System.out.println(w + "원");
			balance -= w;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void deposit (int d) {
		balance += d;
		System.out.println(balance + "원");
	}
	
	public String toString() {
		return "예금주:" + holder + ", 계좌번호:" + accountNum + ", 잔액:" + balance + "원";		
	}
	

}
