package basic4;

public class Student {

	private String studenID;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	public Student () {
//		this.name = "이름 없음";
//		this.kor = 0;
//		this.eng = 0;
//		this.math = 0;
		this("이름 없음", 0, 0, 0);						// 무조건 첫 라인에 넣어야 한다.
		System.out.println("기본 생성자");
	}
	
	public Student (String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자 있는 생성자");
	}
	
	
	public String getStudenID() {
		return studenID;
	}

	public void setStudenID(String studenID) {
		this.studenID = studenID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int getMath() {
		return math;
	}
	

	public void setMath(int math) {
		this.math = math;
	}

	public void calTotal() {
		total = kor + eng + math;
	}
	
	public void calAvg() {
		avg = total / 3;
	}
	
	public void output() {
		System.out.println(name + "님 성적 : " + total + "/" + avg);
	}
		

}

/*
	캡슐화
	 - 멤버변수 (field) : private
	 - 멤버메소드 : public
	 Setter Getter를 자동으로 만들어라 --> private의 변수값을 바꾸기 위해서
	 보안을 강화하기 위해 (외부에서 변수값을 바꾸지 않기 위해)
	 
	 this를 꼭시 명시
*/