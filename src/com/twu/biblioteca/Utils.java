package com.twu.biblioteca;

/**
 * Created by jin on 19/07/2018.
 */
public class Utils {

  public void showMenu(LoginManager loginManager) {
    System.out.println("1. List Books");
    if (!loginManager.isLogged()) {
      System.out.println("l. Login");
    } else {
      System.out.println("2. Checkout Book");
      System.out.println("3. Return Book");
      System.out.println("o. Logout");
    }
  }


}
