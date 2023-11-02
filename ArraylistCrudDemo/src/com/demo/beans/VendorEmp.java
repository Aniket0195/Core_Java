package com.demo.beans;

public class VendorEmp extends Employee{
	
	int noOfEmp;
	double amt;
	
	
	public VendorEmp() {
		super();
	}


	public VendorEmp(int pid, String pname, String mobile, String email,String dept, String desg,int noOfEmp, double amt) {
		super(pid,pname,mobile,email,dept,desg);
		this.noOfEmp = noOfEmp;
		this.amt = amt;
	}


	public int getNoOfEmp() {
		return noOfEmp;
	}


	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}


	public double getAmt() {
		return amt;
	}


	public void setAmt(double amt) {
		this.amt = amt;
	}


	@Override
	public String toString() {
		return "VendorEmp [noOfEmp=" + noOfEmp + ", amt=" + amt + "]";
	}
	
	

}
