package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jin on 19/07/2018.
 */
public class BookTest {
  @Test
  public void should_return_book_detail() throws Exception {
    Book test = new Book("001", "The Sun And Her Flowers", "RUPI KAUR", "2017");
    assertEquals("001   | The Sun And Her Flowers        | RUPI KAUR            | 2017 ", test.getBookDetail());
  }

}