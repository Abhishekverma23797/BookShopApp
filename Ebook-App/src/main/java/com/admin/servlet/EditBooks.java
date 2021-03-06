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
import com.entity.BookDetails;

@WebServlet("/editbooks")
public class EditBooks extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String bookName = request.getParameter("bookname");
			String author = request.getParameter("author");
			Double price = Double.parseDouble(request.getParameter("price"));
			String status = request.getParameter("bstatus");
			
			
			BookDetails bookDetails = new BookDetails();
			
			bookDetails.setBookId(id);
			bookDetails.setBookName(bookName);
			bookDetails.setAuthor(author);
			bookDetails.setPrice(price);
			bookDetails.setStatus(status);
			
			BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
			
			boolean update = dao.updateBooks(bookDetails);
				
			HttpSession session = request.getSession();
			if(update) {
				
				session.setAttribute("Success", "Book Update Successfully...");
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
