/*package com.scp.collection;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		Emp e1=new Emp(10, "A");
		Emp e2=new Emp(11, "B");
		Emp e3=new Emp(10, "");
		Emp e6=e3;
		
		HashSet SetofEmp=new HashSet<>();
		SetofEmp.add(e1);
		SetofEmp.add(e2);
		SetofEmp.add(e3);
		
		SetofEmp.add(e6);
		
		System.out.println("Size : "+SetofEmp.size());
		System.out.println(SetofEmp);
		System.out.println(e1.hashCode()&15);
		System.out.println(e2.hashCode()&15);
		System.out.println(e3.hashCode()&15);
		System.out.println(e6.hashCode()&15);
	}

}
class Emp{
	private int empId;
	private String empName;
	
	
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		//result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmp [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
*/