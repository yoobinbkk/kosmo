package chapter07.EX03;

class BB {
	
	int kor;
	int eng;
	int mat;
	String name;
	
	BB () {}										// 기본 생성자
	BB (int a, int b, int c, String name) {			// 객체 생성 시 필드의 값을 초기화
		kor = a;
		eng = b;
		mat = c;
		this.name = name;
	}
	
	
	// 오른쪽 클릭 --> Source --> Getter and Setter --> 해당 변수 체크 --> Generate
	
	
	// getter, setter를 사용한 필드의 값을 초기화	<-- 필드의 초기값 할당
	// Setter : 필드의 초기값을 할당
	// Getter : 필드의 값을 출력
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show() {		// 메모리의 정보를 출력하는 메소드
		System.out.println(kor + " , " + eng + " , " + mat + " , " + name);
	}
	
}

public class Using_Constructor03 {

	public static void main(String[] args) {
		
		// 필드의 값을 할당하는 3 가지 방법
		
		// 1. 필드의 값을 직접 할당
		BB bb1 =new BB();
		bb1.eng = 90;
		bb1.kor = 80;
		bb1.mat = 70;
		bb1.name = "홍길동";
		bb1.show();
		
		// 2. 생성자를 사용해서 필드의 초기 값을 할당.
		BB bb2 = new BB (70, 80, 90, "김유신");
		bb2.show();
		
		// 3. Setter를 사용해서 값을 입력 <-- 
		BB bb3 = new BB ();
		bb3.setEng(70);
		bb3.setKor(80);
		bb3.setMat(90);
		bb3.setName("감강찬");
		bb3.show();

	}

}
