package basic3;

public class Test02 {

	static void method() throws Exception {
		  throw new Exception();
		}
		public static void main( String [] args ) {   
		     try{
		         method();
		} catch( Exception ex ) {
		         System.out.println("예외 처리");
		     } 
		}

}