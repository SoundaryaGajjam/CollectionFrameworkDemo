package com.scp.collection;

public class Student{// implements Comparable<Student>{
	private int studId;
	private String studName;
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studId;
		//result = prime * result + ((studName == null) ? 0 : studName.hashCode());
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
		Student other = (Student) obj;
		if (studId != other.studId)
			return false;
		/*if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;*/
		return true;
	}
	/*@Override
	public int compareTo(Student o) {
		
		return this.studId-o.studId;
	}*/
	
	/*@Override
	public int compareTo(Student o) {
		
		return this.studName.compareTo(o.studName);
	}*/

}
