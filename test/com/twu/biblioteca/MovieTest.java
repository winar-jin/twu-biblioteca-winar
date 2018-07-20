package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class MovieTest {
  private static Movie movie;

  @BeforeClass
  public static void beforeClass() {
    movie = new Movie("001", "Jurassic World: Fallen Kingdom", "2018", "Juan Antonio Bayona", "6.9");
  }

  @Test
  public void should_return_movie_detailed_information() throws Exception {
    assertEquals("001        | Jurassic World: Fallen Kingdom | Juan Antonio Bayona | 2018 | 6.9", movie.getMovieInfo());
  }

  @Test
  public void should_return_movie_brief_intro() throws Exception {
    assertEquals("001        | Jurassic World: Fallen Kingdom", movie.getMovieIntro());
  }

}