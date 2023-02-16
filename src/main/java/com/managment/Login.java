package com.managment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBUtil.DBUtil;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doGet(req, resp);
    }

    String email,password;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		email = req.getParameter("uemail");
		password = req.getParameter("upass");
		
		//out.println(""+email);
		//out.println(""+password);
		con = DBUtil.getConnection();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from users where email='"+email+"' and password1='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				HttpSession session = req.getSession();
				session.setAttribute("user", email);
				res.sendRedirect("index.jsp");
				//out.println("Login Succefully !!!");
			}
			else {
				out.println("Login Failed !!!");
			}
			
				
		}catch(Exception e) {
			out.println(""+e);
		}
		
		
		
	}


}
