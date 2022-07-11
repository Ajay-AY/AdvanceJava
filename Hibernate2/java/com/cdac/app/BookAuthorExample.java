package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.BookAuthorDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {

	public static void main(String[] args) {
		BookAuthorDao ba = new BookAuthorDao();
		/*Book book = new Book();
		book.setName("Science(X)");
		book.setPrice(300);
		
		ba.save(book);*/
		
		
		 /* Author author = new Author();
		  author.setName("Ghi");
		  author.setEmail("ghi@gmail.com");
		  
		  ba.save(author); */
		 
		/*List<Author> authors = new ArrayList<Author>();
		authors.add((Author) ba.fetchById(Author.class, 1));
		authors.add((Author) ba.fetchById(Author.class, 2));
		Book book = (Book) ba.fetchById(Book.class, 2);
		book.setAuthor(authors);
		ba.save(book);*/
		

		/*List<Book> book = new ArrayList<Book>();
		book.add((Book) dao.fetchById(Book.class, 3));
		book.add((Book) dao.fetchById(Book.class, 4));
		Author author = (Author) dao.fetchById(Author.class, 1);
		System.out.println(" "+ author.getName());
		author.setBook(book);
		System.out.println(" "+ book);
		dao.save(author);*/
		
		Author aut = new Author();
		
		List<Book> book = new ArrayList<>();
		Book book1 = new Book();
		book1.setName("DOM");
		book1.setPrice(300);
		
		Book book2 = new Book();
		book2.setName("SOM");
		book2.setPrice(350);
		
		
		book.add(book2);
		book.add(book1);
		
		
		aut.setName("PQR");
		aut.setEmail("pqr@gmail.com");
		aut.setBook(book);
		ba.save(aut);
		
		
		
		
		}



}
