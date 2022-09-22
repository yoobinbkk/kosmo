package singleton;

public class WorkA {
	
	// DBConnect con = new DBConnect();
	DBConnect con;
	
	public WorkA () {
//		con = new DBConnect();
//		con.getInstance();
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}
	
}
