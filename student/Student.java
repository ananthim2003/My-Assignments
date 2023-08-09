package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student Name:Ananthi");
	}
	public void studentDept()
	{
		System.out.println("Student Department:Computer Science");
	}
	public void studentId()
	{
		System.out.println("Student ID:20G109");
	}
	public static void main(String[] args) {
		Student mystud=new Student();
		mystud.collegeName();
		mystud.collegeCode();
		mystud.collegeRank();
		mystud.deptNmae();
		mystud.studentName();
		mystud.studentId();
		mystud.studentDept();

	}

}
