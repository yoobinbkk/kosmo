package poly;

abstract public class Item {
	
	protected int num;
	protected String title;
	
	Item () {}
	Item (int num, String title) {
		this.num = num;
		this.title = title;
	}
	
//	public void output() {					// 오러라이딩 --> 전부 public이어야 한다
//		System.out.println(num);
//		System.out.println(title);
//	}
	
	abstract public void output();
	
}
