package com.managment;

import java.io.Serializable;

public class Employee implements Serializable {
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_dept="
				+ emp_dept + ", emp_hire=" + emp_hire + ", emp_exp=" + emp_exp + ", emp_dob=" + emp_dob + ", emp_adrs="
				+ emp_adrs + ", emp_email=" + emp_email + "]";
	}
	private static final long serialVersionUID = 1L;
	private String emp_id;
	private String emp_name;
	private String emp_salary;
	private String emp_dept;
	private String emp_hire;
	private String emp_exp;
	private String emp_dob;
	private String emp_adrs;
	private String emp_email;
	public Employee(String emp_id, String emp_name, String emp_salary, String emp_dept, String emp_hire, String emp_exp, String emp_dob, String emp_adrs, String emp_email) {
		super();
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
		this.emp_dept=emp_dept;
		this.emp_hire=emp_hire;
		this.emp_exp=emp_exp;
		this.emp_dob=emp_dob;
		this.emp_adrs=emp_adrs;
		this.emp_email=emp_email;
	}
	public Employee() {
		
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public String getEmp_hire() {
		return emp_hire;
	}
	public void setEmp_hire(String emp_hire) {
		this.emp_hire = emp_hire;
	}
	public String getEmp_exp() {
		return emp_exp;
	}
	public void setEmp_exp(String emp_exp) {
		this.emp_exp = emp_exp;
	}
	public String getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}
	public String getEmp_adrs() {
		return emp_adrs;
	}
	public void setEmp_adrs(String emp_adrs) {
		this.emp_adrs = emp_adrs;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	
}
