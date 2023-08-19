package com.BikkadIT.SpringMVCFirstApp.model;

public class Student {
	
	private int sid;
	private String sname;
	private String saddrss;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddrss() {
		return saddrss;
	}
	public void setSaddrss(String saddrss) {
		this.saddrss = saddrss;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddrss=" + saddrss + "]";
	}
	

}
