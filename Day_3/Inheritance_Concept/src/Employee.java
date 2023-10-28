import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person
{
	public int dep;
	public String desig;
	public LocalDate doj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return super.toString()+"Employee [dep=" + dep + ", desig=" + desig + "]";
	}

	public Employee(int dep, String desig,String name, int pid, String mo_no,LocalDate doj) {
		super(pid,name,mo_no);
		System.out.println("in Para Emp");
		this.dep = dep;
		this.desig = desig;
		this.doj=doj;
	}
	public Employee()
	{
		System.out.println("in default emp");
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
}
