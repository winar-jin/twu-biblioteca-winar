package com.twu.biblioteca;

/**
 * Created by jin on 19/07/2018.
 */
public class Book {
  private String id;
  private String name;
  private String author;
  private String yearOfPublish;
  private int remain;

  public Book(String id, String name, String author, String yearOfPublish, int remain) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.yearOfPublish = yearOfPublish;
    this.remain = remain;
  }

  public int getRemain() {
    return remain;
  }

  public String getId() {
    return id;
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

  public void checkOutBook() {
    this.remain--;
  }

  public void returnBook() {
    this.remain++;
  }

  public String getBookDetail() {
    return String.format("%-5s | %-30s | %-20s | %-5s | %-5s ", getId(), getName(), getAuthor(), getYearOfPublish(), getRemain());
  }
}
