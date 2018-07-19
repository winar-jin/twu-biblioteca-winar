package com.twu.biblioteca;

/**
 * Created by jin on 19/07/2018.
 */
public class Book {
  private String id;
  private String name;
  private String author;
  private String yearOfPublish;

  public Book(String id, String name, String author, String yearOfPublish) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.yearOfPublish = yearOfPublish;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public String getYearOfPublish() {
    return yearOfPublish;
  }

  public String getBookDetail() {
    return String.format("%-20s | %-10s | %-5s", getName(), getAuthor(), getYearOfPublish());
  }
}