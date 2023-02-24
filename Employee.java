package com.ericcson.io;

import java.io.Serializable;

public class Employee implements Serializable {

	private int eid;
	private String ename;
	private float esal;
	private String erole;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", erole=" + erole + "]";
	}

	// setters and getters
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
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {

		this.ename = ename;

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
