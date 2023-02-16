package com.managment;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.DBUtil;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

    String user_name,user_email,user_pass1,user_pass2;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		user_name= req.getParameter("uname");
		user_email= req.getParameter("uemail");
		user_pass1= req.getParameter("pass1");
		user_pass2= req.getParameter("pass2");
		
		
		//out.println(""+user_name);
		//out.println(""+user_email);
		//out.println(""+user_pass1);
		//out.println(""+user_pass2);
		
		
		//Connetion Of Database Code 
		con = DBUtil.getConnection();
		try {
		String sql ="insert into users(username,email,password1,password2) values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, user_name);
		ps.setString(2, user_email);
		ps.setString(3, user_pass1);
		ps.setString(4, user_pass2);
		
		ps.executeUpdate();
		
		out.println("<html><head><script>alert('Your Data is inserted Succefully !!!!');</script></head></html>");
		res.sendRedirect("login.jsp");
		
		
		}catch(Exception e) {
			out.println(""+e);
		}
		
	}

}
