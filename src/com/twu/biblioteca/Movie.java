package com.twu.biblioteca;

/**
 * Created by jin on 20/07/2018.
 */
public class Movie {
  private String id;
  private String name;
  private String year;
  private String director;
  private String rating;

  public Movie(String id, String name, String year, String director, String rating) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.director = director;
    this.rating = rating;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getMovieInfo() {
    return String.format("%-10s | %-20s | %-10s | %-4s | %-2s", getId(), getName(), getDirector(), getYear(), getRating());
  }

  public String getMovieIntro() {
    return String.format("%-10s | %-20s", getId(), getName());
  }
}
