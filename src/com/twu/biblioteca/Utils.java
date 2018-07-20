package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jin on 19/07/2018.
 */
public class Utils {
  static List<Book> books = new ArrayList<Book>();

  public void intiBooks() {
    books.add(new Book("001", "Programming Pearls", "Jon L. Bentley,  Patrick Chan ", "1986", 5));
    books.add(new Book("002", "Programming in Scala ", "Martin Odersky", "2008", 5));
    books.add(new Book("003", "The Recovery", "Suzanne Young", "2015", 5));
    books.add(new Book("004", "Programming Python", "Mark Lutz", "1996", 5));
    books.add(new Book("005", "The Psychology of Computer Programming", "Gerald M. Weinberg", "1971", 5));
  }

  public void showMenu(LoginManager loginManager) {
    System.out.println("1. List Books");
    if (!loginManager.isLogged()) {
      System.out.println("l. Login");
    } else {
      System.out.println("2. Checkout Book");
      System.out.println("3. Return Book");
      System.out.println("o. Logout");
    }
    System.out.println("e. exit");
  }

  public void listBooks() {
    System.out.println("Here are the book lists:");
    Iterator bookIt = books.iterator();
    while (bookIt.hasNext()) {
      Book book = (Book) bookIt.next();
      System.out.println(String.format("| %-5s | %-20s |", book.getId(), book.getName()));
    }
  }

  public Book getBook(String bookNo) {
    for (Book book : books) {
      if (book.getId().equals(bookNo)) {
        return book;
      }
    }
    return null;
  }

  public String getBookInfo(String bookNo) {
    Book book = getBook(bookNo);
    if (book != null) {
      return book.getBookDetail();
    }
    return "That book is not available.";
  }

  public boolean checkoutBook(String bookNo) {
    Book book = getBook(bookNo);
    if (book != null && book.getRemain() > 0) {
      book.checkOutBook();
      return true;
    }
    return false;
  }

  public boolean returnBook(String bookNo) {
    Book book = getBook(bookNo);
    if (book != null) {
      book.returnBook();
      return true;
    }
    return false;
  }
}
