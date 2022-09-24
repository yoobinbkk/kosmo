package poly;

public class Book extends Item {
	
	private String author;
	private String publisher;
	
	public Book () {
		this(0, "제목없음", "무명", "출판사 모름");
		System.out.println("Book 기본생성자");
	}
	public Book (int num, String title, String author, String publisher) {
//		super.num = num;												// super (부모 것 명시)
//		super.title = title;
		super(num, title);
		
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자 생성자");
	}
	
	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
	}
	
}
