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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			UserDAOImpl userdao = new UserDAOImpl(DBConnect.getConn());

			HttpSession session = request.getSession();

			/*
			 * System.out.println(email); System.out.println(password);
			 */

			if ("admin123@gmail.com".equals(email) && "admin".equals(password)) {

				User user = new User();
				session.setAttribute("userObj", user);
				response.sendRedirect("Admin/home.jsp");
			} else {

				User user = userdao.login(email, password);

				if (user != null) {

					session.setAttribute("userObj", user);
					response.sendRedirect("Home.jsp");
				} else {
					session.setAttribute("Fail", "Check Email And Password");
					response.sendRedirect("Login.jsp");
				}
				response.sendRedirect("Home.jsp");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
