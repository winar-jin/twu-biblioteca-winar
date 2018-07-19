package com.twu.biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;
import sun.rmi.runtime.Log;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class LoginManagerTest {
  static LoginManager loginManager;

  @BeforeClass
  public static void beforeClass() {
    loginManager = new LoginManager();
  }

  @Test
  public void should_return_false_if_not_login() throws Exception {
    assertEquals(false, loginManager.isLogged());
  }

  @Test
  public void should_return_true_after_login() throws Exception {
    User user = new User("001", "001", "winar", "winar@twu.com", "13000000000");
    loginManager.login(user);
    assertEquals(true, loginManager.isLogged());
  }

  @Test
  public void should_return_user_info_when_user_login() throws Exception {
    User user = new User("001", "001", "winar", "winar@twu.com", "13000000000");
    loginManager.login(user);
    loginManager.getLoginedUserInfo();
    assertEquals("001        | 001        | winar      | winar@twu.com        | 13000000000", loginManager.getLoginedUserInfo());
  }

  @Test
  public void should_return_false_after_user_logout() throws Exception {
    loginManager.logout();
    assertEquals(false, loginManager.isLogged());
  }

}