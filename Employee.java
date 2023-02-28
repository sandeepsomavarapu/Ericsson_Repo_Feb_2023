package com.ericcson.collections;

public class Employee {

	private int empId;
	private String empname;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		System.out.println(result);
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		System.out.println(result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {// ==emp ,emp1
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

}
