package com.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.BookDetails;
import com.mysql.cj.protocol.Resultset;

public class BookDAOImpl implements BookDAO {

	private Connection connection;

	public BookDAOImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addBooks(BookDetails bookDetails) {

		boolean status = false;

		try {

			String query = "INSERT INTO  book_details (bookName, author, price, booksCategory, status, photo, user_email) VALUES(?,?,?,?,?,?,?)";

			PreparedStatement ps = connection.prepareStatement(query);

			ps.setString(1, bookDetails.getBookName());
			ps.setString(2, bookDetails.getAuthor());
			ps.setDouble(3, bookDetails.getPrice());
			ps.setString(4, bookDetails.getBooksCategory());
			ps.setString(5, bookDetails.getStatus());
			ps.setString(6, bookDetails.getPhoto());
			ps.setString(7, bookDetails.getUser_email());

			int update = ps.executeUpdate();

			if (update == 1) {
				status = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return status;
	}

	public List<BookDetails> getAllBook() {
		// TODO Auto-generated method stub
		List<BookDetails> listBook = new ArrayList<BookDetails>();

		BookDetails bookDetails = null;
		try {

			String query = "SELECT * FROM  book_details";

			PreparedStatement ps = connection.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				bookDetails = new BookDetails();

				bookDetails.setBookId(rs.getInt(1));
				bookDetails.setBookName(rs.getNString(2));
				bookDetails.setAuthor(rs.getString(3));
				bookDetails.setPrice(rs.getDouble(4));
				bookDetails.setBooksCategory(rs.getNString(5));
				bookDetails.setStatus(rs.getString(6));
				bookDetails.setPhoto(rs.getString(7));
				bookDetails.setUser_email(rs.getString(8));

				listBook.add(bookDetails);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listBook;
	}

	public BookDetails getBookbyId(int id) {

		BookDetails b = null;

		try {

			String query = "SELECT * FROM  book_details WHERE bookId = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				b = new BookDetails();
				b.setBookId(rs.getInt(1));
				b.setBookName(rs.getNString(2));
				b.setAuthor(rs.getString(3));
				b.setPrice(rs.getDouble(4));
				b.setBooksCategory(rs.getNString(5));
				b.setStatus(rs.getString(6));
				b.setPhoto(rs.getString(7));
				b.setUser_email(rs.getString(8));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return b;
	}

	public boolean updateBooks(BookDetails bookDetails) {
		boolean status = false;

		try {
			String query = "UPDATE book_details  SET bookName=?,author=? ,price=?,status=? WHERE bookID = ?";
		

			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, bookDetails.getBookName());
			ps.setString(2, bookDetails.getAuthor());
			ps.setDouble(3, bookDetails.getPrice());
			ps.setString(4, bookDetails.getStatus());
			ps.setInt(5, bookDetails.getBookId());
			
			  int success = ps.executeUpdate();
			  System.out.println(success);
			  if(success==1) {
				  status = true;
			  }
			

		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return status;
	}

	public boolean deleteBooks(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
				
			String query = "DELETE FROM book_details WHERE  bookID = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, id);
			
			int success = ps.executeUpdate();
			
			if(success==1) {
				status = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
}
