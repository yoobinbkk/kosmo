package inherit;

public class MainTest {

	public static void main(String[] args) {
		
//		Mother m = new Mother();
//		m.job();
//		m.gene();
//		
//		Daughter d = new Daughter();
//		d.study();
//		d.job();
//		d.gene();
		
//		Daughter d2 = new Mother();			// 오류 : 딸의 메모리가 존재하지 않는다
		
		// * 부모 변수에 자식 객체 생성이 가능
//		Mother m2 = new Daughter();
//		m2.gene();
//		m2.job();
//		m2.study();
		
		// 오버라이딩된 부분만 출력된다.
		
		// * 형변환 : (casting)
		// 1> 기본형끼리
		// 2> 참조형에서 상속관계 있는 경우만 가능
		
		// String s = new String("~~");
		// StringBuffer sb = (StringBuffer)s; --> x
		
		Mother m3 = new Mother();
		Daughter d3 = (Daughter) m3;
		
		Daughter d4 = new Daughter();
		Mother m4 = (Mother) d4;
	}

}
