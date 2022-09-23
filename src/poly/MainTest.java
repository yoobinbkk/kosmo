package poly;

public class MainTest {

	public static void main(String[] args) {

//		Item i = new Item();			// 오류 : abstract

		Book b = new Book(12, "Outsider", "Camu", "Penguin");
		b.output();

		System.out.println("===================");

		Cd d = new Cd();
		d.num = 14;
		d.title = "가을빛";
		//	d.singer = "노을";
		d.output();

		System.out.println("===================");

		Book b2 = new Book();
		b2.output();

	}

}
