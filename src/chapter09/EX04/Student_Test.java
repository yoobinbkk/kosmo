package chapter09.EX04;

class Student {
	
	static int serialNum = 1000;			// 모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
	int studentID;							// 학생 공유ID
	String studentName;						// 학생 이름
	int grade;								// 학년 : 기본값으로 4 학년
	String address;							// 주소 : "서울"
	static int serialNum2;
	
	//기본 생성자
	Student () {
		serialNum++;						// 객체를 생성 시 1씩 증가
		studentID = serialNum;
		serialNum2++;
		grade = 4;
		address = "서울";
	}
	
	Student (String studentName) {
		this();
		this.studentName = studentName;
	}
	
	Student (String studentName, int grade) {
		this(studentName);
		this.grade = grade;
	}
	
	Student (String studentName, String address) {
		this(studentName);
		this.address = address;
	}
	
	Student (String studentName, int grade, String address) {
		this(studentName, grade);
		this.address = address;
	}
	
	void print () {
		System.out.println("=====" + serialNum2 +" 번째 학생========");
		System.out.println("학생 ID \t: " + studentID);
		System.out.println("학생 이름 \t: " + studentName);
		System.out.println("학년 \t: " + grade);
		System.out.println("주소 \t: " + address);
		System.out.println();
	}
}

public class Student_Test {

	public static void main(String[] args) {
		
		// 객체를 생성 시 자동으로 학번이 1000부터 1씩 자동으로 학번이 저장되어야 한다.
		// studentID : 1000 부터 학생객체를 생성할 때마다 고유한 값으로 적용되어 있어야 한다.
		
		Student lee = new Student("이지원");	// 1001
		lee.print();
		
		Student hong = new Student("홍지원");	// 1002
		hong.print();
		
		Student jung = new Student("정지원");	// 1003
		jung.print();
		
		Student park = new Student("박지원");	// 1004
		park.print();



	}

}
