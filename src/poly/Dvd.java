package poly;

public class Dvd extends Item {
	
	private String actor;
	private String director;
	
	Dvd () {}
	Dvd (int num, String title, String actor, String director) {
//		super.num = num;
//		super.title = title;
		super(num, title);
		this.actor = actor;
		this.director = director;
	}
	
	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("배우 : " + actor);
		System.out.println("감독 : " + director);
	}
	
}
