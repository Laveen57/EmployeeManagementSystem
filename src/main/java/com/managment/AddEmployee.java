package com.managment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.file.Write;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	String emp_id,emp_name,emp_salary,emp_dept,emp_hire,emp_exp,emp_dob,emp_adrs,emp_email;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		Employee emp=new Employee();
		emp_id=req.getParameter("emp_id");
		emp_name= req.getParameter("emp_name");
		emp_salary= req.getParameter("emp_salary");
		emp_dept= req.getParameter("emp_dept");
		emp_hire= req.getParameter("emp_hire");
		emp_exp= req.getParameter("emp_exp");
		emp_dob= req.getParameter("emp_dob");
		emp_adrs= req.getParameter("emp_adrs");
		emp_email= req.getParameter("emp_email");
		emp.setEmp_id(emp_id);
		emp.setEmp_name(emp_name);
		emp.setEmp_salary(emp_salary);
		emp.setEmp_dept(emp_dept);
		emp.setEmp_hire(emp_hire);
		emp.setEmp_exp(emp_exp);
		emp.setEmp_dob(emp_dob);
		emp.setEmp_adrs(emp_adrs);
		emp.setEmp_email(emp_email);
		try {
			Write.write(emp, "D:/LMS/EmployeeManagment/DB/file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.println("<html><head><script>alert('Your Data is inserted Succefully !!!!');</script></head></html>");
		res.sendRedirect("index.jsp");
		
		}
		
}

