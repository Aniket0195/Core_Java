import java.time.LocalDate;
public class TestEmployee {
	
	public static void main(String [] args)
	
	{
		Employee e = new Employee(007,"Captain","MsDhoni",7,"777777",LocalDate.of(2004,12,26));
		System.out.println(e);
		Employee f=new SalariedEmp(0045,"failed captain","RO HIT VADAPAAV",45,"45454545",LocalDate.of(2007,6,23),10,45);
		System.out.println(f);
		Employee e1 = new SalariedEmp();
		((SalariedEmp)e1).setBonus(95);
	
	System.out.println("Bonus = "+((SalariedEmp)e1).getBonus());
		System.out.println(e1);
		
		
	}
	

}
