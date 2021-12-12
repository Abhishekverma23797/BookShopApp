package com.admin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;

@WebServlet("/delete_books")
public class BooksDelete extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			
			BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
			
			boolean delete = dao.deleteBooks(id);
			
			HttpSession session = request.getSession();
			if(delete) {
				
				session.setAttribute("Success", "Book Delete Successfully...");
				response.sendRedirect("Admin/all_books.jsp");
			}else {
				session.setAttribute("Faild", "Something wrong...");
				response.sendRedirect("Admin/all_books.jsp");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
