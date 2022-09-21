package basic3;

public class Test04 {
	
	public static void main( String [] args ) {   
	     try{
	         System.exit(0);
	} finally {
	         System.out.println("FINALLY");
	     } 
	}

}

// 답 : 아무것도 실행되지 않는다.
// 이유 : try 안에 있는 System.exit(0); 는 에러 사항이 아니다.
// 		 따라서 그 기능대로 메소드가 종료되어 finally 안에 있는 "Finally"는 출력되지 않는다.