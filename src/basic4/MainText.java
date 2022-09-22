package basic4;

public class MainText {

	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		
		// 값 지정 1 - setter
//		s.setName("임유빈");
//		s.setKor(100);
//		s.setEng(30);
//		s.setMath(55);
		
		// 값 지정 2 - 생성자
		s.calTotal();
		s.calAvg();
		s.output();
		
		
		
	}

}
