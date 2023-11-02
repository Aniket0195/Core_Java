package com.demo.beans;

public class SalariedEmp extends Employee{
	
	private double sal;
	private double bonus;
	
	
	
	public SalariedEmp() {
		super();
	}

	public SalariedEmp(int pid, String pname, String mobile, String email,String dept, String desg,double sal, double bonus) {
		super(pid,pname,mobile,email,dept,desg);
		this.sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
	
	

}
