package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jin on 19/07/2018.
 */
public class UserTest {

  @Test
  public void should_return_user_info() {
    User test = new User("001", "001", "test1", "test1@twu.com", "13000000000");
    assertEquals("001        | 001        | test1      | test1@twu.com        | 13000000000", test.getUserInfo());
  }

}
