package com.managment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.DBUtil.DBUtil;
import com.file.Read;


/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

    String emp_id;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		TreeMap<String, Employee> map = null;
		try {
			map = (TreeMap<String, Employee>) Read.readAll("D:/LMS/EmployeeManagment/DB/file.txt");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp_id= req.getParameter("id");
		PrintWriter out = res.getWriter();
		for (Entry<String, Employee> entry : map.entrySet()) {
	        String mapKey = entry.getKey();
	        if(emp_id.equals(mapKey))
	        {
	        	map.remove(mapKey);
	        }
	    }
		out.println("<html><head><script>alert('Your Data is Deleted Succefully !!!!');</script></head></html>");
		res.sendRedirect("index.jsp");
		
//		con = DBUtil.getConnection();
//		try {
//		String sql ="delete  from employees where name=?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		
//		ps.setString(1, emp_id);
//		ps.executeUpdate();
//		
//		out.println("<html><head><script>alert('Employee is Deleted Succefully !!!!');</script></head></html>");
//		res.sendRedirect("Show");
//		
//		}catch(Exception e) {
//			out.println(""+e);
//		}
		
	}

}
