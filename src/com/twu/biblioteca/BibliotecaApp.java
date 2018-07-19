package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BibliotecaApp {
  static List<Book> books = new ArrayList<Book>();

  public static void main(String[] args) {
    System.out.println("Hello, Welcome to The Bangalore Public Library!");
    System.out.println("-----------------------------------------------");
    System.out.println("Here are the book lists:");
    books.add(new Book("001", "Programming Pearls", "Jon L. Bentley,  Patrick Chan ", "1986", 5));
    books.add(new Book("002", "Programming in Scala ", "Martin Odersky", "2008", 5));
    books.add(new Book("003", "The Recovery", "Suzanne Young", "2015", 5));
    books.add(new Book("004", "Programming Python", "Mark Lutz", "1996", 5));
    books.add(new Book("005", "The Psychology of Computer Programming", "Gerald M. Weinberg", "1971", 5));
    Iterator bookIt = books.iterator();
    while (bookIt.hasNext()) {
      Book book = (Book) bookIt.next();
      System.out.println(String.format("| %-5s | %-20s |", book.getId(), book.getName()));
    }
    System.out.println("-----------------------------------------------");
  }
}
