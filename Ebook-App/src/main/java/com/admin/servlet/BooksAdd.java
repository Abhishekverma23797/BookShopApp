package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDetails;

@WebServlet("/add_books")

@MultipartConfig
public class BooksAdd extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String bookName = request.getParameter("bookname");
			String author = request.getParameter("author");
			Double price = Double.parseDouble(request.getParameter("price"));
			String categories = request.getParameter("categorie");
			String status = request.getParameter("bstatus");

//			for imag
			Part part = request.getPart("bimg");
			String fileName = part.getSubmittedFileName();

			BookDetails bookDetails = new BookDetails(bookName, author, price, categories, status, fileName, "admin");

			BookDAOImpl bookDAOImpl = new BookDAOImpl(DBConnect.getConn());

			boolean sucess = bookDAOImpl.addBooks(bookDetails);

			HttpSession session = request.getSession();

			if (sucess) {

				// Getting location for images
				String path = getServletContext().getRealPath("") + "bookimg";

				File file = new File(path);
				part.write(path + File.separator + fileName);

				System.out.println(path);
				session.setAttribute("Success", "Book Add Successfully");
				response.sendRedirect("Admin/add_books.jsp");
				System.out.println(bookDetails);
			} else {
				session.setAttribute("Faild", "Faild To book Add");
				response.sendRedirect("Admin/add_books.jsp");
			}

			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
