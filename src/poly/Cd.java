package poly;

public class Cd extends Item {
	
	private String singer;
	
	Cd () {}
	Cd (int num, String title, String singer) {
		super.num = num;
		super.title = title;
		this.singer = singer;
	}
	
	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("가수 : " + singer);
	}
	
}
