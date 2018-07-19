package com.twu.biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jin on 19/07/2018.
 */
public class BookTest {

  @Test
  public void should_return_book_detail() throws Exception {
    Book test = new Book("001", "The Sun And Her Flowers", "RUPI KAUR", "2017", 5);
    assertEquals("001   | The Sun And Her Flowers        | RUPI KAUR            | 2017  | 5     ", test.getBookDetail());
  }

  @Test
  public void should_minus_1_if_checkout_the_book() {
    Book test = new Book("001", "The Sun And Her Flowers", "RUPI KAUR", "2017", 5);
    test.checkOutBook();
    assertEquals(4, test.getRemain());
  }

  @Test
  public void should_add_1_if_return_the_book() {
    Book test = new Book("001", "The Sun And Her Flowers", "RUPI KAUR", "2017", 5);
    test.returnBook();
    assertEquals(6, test.getRemain());
  }

}