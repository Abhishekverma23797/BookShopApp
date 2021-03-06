package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phno = request.getParameter("phone");
			String password = request.getParameter("password");
			String check = request.getParameter("check");

			/*
			 * System.out.println(name); System.out.println(email);
			 * System.out.println(phno); System.out.println(password);
			 * System.out.println(check);
			 */

			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhno(phno);
			us.setPassword(password);
			
			HttpSession session = request.getSession();

			if(check != null) {
				UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());

				boolean status = dao.userRegister(us);
				
				if(status) {
					System.out.println("Record Inserted succesfully");
					
					session.setAttribute("Success","Registration Successfully");
					response.sendRedirect("Register.jsp");
				}
			}else {
				
//				System.out.println("Please Accept Terms and Condition");
				
				session.setAttribute("Faild","Please Accept Terms and Condition");
				response.sendRedirect("Register.jsp");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
