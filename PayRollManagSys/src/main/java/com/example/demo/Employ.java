package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {
	
	@Id
	@Column(name="Empno")
	private int empno;
	@Column(name="Name")
	private String name;
	@Column(name="Gender")
	private String gender;
	@Column(name= "Dept")
	private String dept;
	@Column(name="Desig")
	private String desig;
	@Column(name="DateOfBirth")
	private Date dateOfBirth;
	@Column(name="DateOfJoin")
	private Date dateOfJoin;
	@Column(name="Salary")
	private double salary;
	@Column(name="LeaveAvailable")
	private int leaveAvailable;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getLeaveAvailable() {
		return leaveAvailable;
	}
	public void setLeaveAvailable(int leaveAvailable) {
		this.leaveAvailable = leaveAvailable;
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(int empno, String name, String gender, String dept, String desig, Date dateOfBirth, Date dateOfJoin,
			double salary, int leaveAvailable) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.leaveAvailable = leaveAvailable;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", dateOfBirth=" + dateOfBirth + ", dateOfJoin=" + dateOfJoin + ", salary=" + salary
				+ ", leaveAvailable=" + leaveAvailable + "]";
	}
	
	

}
