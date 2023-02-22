package com.ericcson.oops;

public class Employee {

	private int eid;
	private String ename;
	private float esal;
	private String erole;

	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", erole=" + erole + "]";
	}
	//setters and getters
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int eid, String ename, float esal, String erole) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.erole = erole;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		if(eid>0) {
			this.eid = eid;
		}
		else
		{
			System.out.println("Invalid Eid");
		}
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		if(ename.length()>=6)
			this.ename = ename;
		else
			System.out.println("Name length must be above 6");
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getErole() {
		return erole;
	}
	public void setErole(String erole) {
		this.erole = erole;
	}
	
	 
	
	
	
	
}
