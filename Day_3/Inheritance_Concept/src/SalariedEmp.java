import java.time.LocalDate;

public class SalariedEmp extends Employee
{
	public int sal;
	public int bonus;
	public int total_sal;

	public SalariedEmp(int pid, String name, String mo_no,int dep, String desig,LocalDate doj,int sal, int bonus) {
		super(pid,name,mo_no,dep,desig,doj);
		this.sal = sal;
		this.bonus = bonus;
		this.total_sal = (sal+bonus);
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus +",Total_sal= " +total_sal+"]";
		
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public SalariedEmp() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor called");
	}

}
