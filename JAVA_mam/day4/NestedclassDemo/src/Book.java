
public class Book {
	private int bkid;
	private String bkname,author;

	// private Lesson l1;
	
	public void display()
	{
		System.out.println(b.lessonid);
	}
	class Lesson{
		int lessonid; 
		String lname;
		
		Lesson(){
			lessonid=10;
			lname=" ";
		}
		Lesson(int id, String name){
			lessonid=id;
			lname="HelloWorld";
		}
		public void m1() {
			System.out.println("in m1"+bkid);
		}
	}
	public Book() {
		super();
	}
	public Book(int bkid, String bkname, String author) {
		super();
		this.bkid = bkid;
		this.bkname = bkname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bkname=" + bkname + ", author=" + author + "]";
	}
	
	

}
