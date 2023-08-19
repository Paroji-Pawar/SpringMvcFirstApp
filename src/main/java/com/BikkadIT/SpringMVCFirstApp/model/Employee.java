package com.BikkadIT.SpringMVCFirstApp.model;

public class Employee {
	
	private String empname;
	private int empid;
	private String empAddr;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empAddr=" + empAddr + "]";
	}

}
