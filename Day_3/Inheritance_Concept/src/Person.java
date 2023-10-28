
public class Person {

	public int pid;
	public String name;
	public String mo_no;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMo_no() {
		return mo_no;
	}
	public void setMo_no(String mo_no) {
		this.mo_no = mo_no;
	}
	
	public Person(int pid, String name, String mo_no) {
		this.pid = pid;
		this.name = name;
		this.mo_no = mo_no;
		System.out.println("in Para person");
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", mo_no=" + mo_no + "]";
	}
	public Person()
	{
	  System.out.println("in default Person");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
