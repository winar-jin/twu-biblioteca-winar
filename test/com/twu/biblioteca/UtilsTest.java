package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class UtilsTest {
  static LoginManager loginManager;
  static Utils utils;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeClass
  public static void beforeClass() {
    loginManager = new LoginManager();
    utils = new Utils();
  }

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void should_return_one_option_when_user_not_login() throws Exception {
    utils.showMenu(loginManager);
    assertEquals("1. List Books\nl. Login\ne. exit\n", outContent.toString());
  }

  @Test
  public void should_return__options_when_user_login() throws Exception {
    User user = new User("001", "001", "test1", "test1@twu.com", "13000000000");
    loginManager.login(user);
    utils.showMenu(loginManager);
    assertEquals("1. List Books\n2. Checkout Book\n3. Return Book\no. Logout\ne. exit\n", outContent.toString());
  }

}