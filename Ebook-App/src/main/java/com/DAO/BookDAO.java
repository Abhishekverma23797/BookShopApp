package com.DAO;

import java.util.List;

import com.entity.BookDetails;

public interface BookDAO {

   public boolean addBooks(BookDetails bookDetails);
   
   public List<BookDetails> getAllBook();
   
   public BookDetails getBookbyId(int id);
   
   public boolean updateBooks(BookDetails  bookDetails);
   
   public boolean deleteBooks(int id);
	
}
