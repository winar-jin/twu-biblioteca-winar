package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
  static Utils utils = new Utils();
  static LoginManager loginManager = new LoginManager();
  static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    utils.intiBooks();
    System.out.println("Hello, Welcome to The Bangalore Public Library!");
    System.out.println("-----------------------------------------------");
    utils.showMenu(loginManager);
    System.out.println("················································");
    System.out.println("Enter your option: ");
    char option;
    while ((option = reader.next().charAt(0)) != 'e') {
      switch (option) {
        case '1':
          utils.listBooks();
          utils.showMenu(loginManager);
          break;
        case '2':
          if (!loginManager.isLogged()) {
            System.out.println("Select a valid option!");
            utils.showMenu(loginManager);
            break;
          }
          utils.listBooks();
          System.out.println("Please enter the number book that you want to checkout");
          String bookNo = reader.next();
          String bookInfo = utils.getBookInfo(bookNo);
          System.out.println(bookInfo);
          if (!bookInfo.equals("That book is not available.")) {
            System.out.println("Are you sure the book is what you want? (Y/N)");
            String confirm = reader.next();
            if (confirm.equals("Y") && utils.checkoutBook(bookNo)) {
              System.out.println("Thank you! Enjoy the book");
            } else {
              System.out.println("Checkout cancel...");
            }
          }
          utils.showMenu(loginManager);
          break;
        case '3':
          if (loginManager.isLogged()) {

          } else {
            System.out.println("Select a valid option!");
          }
          utils.showMenu(loginManager);
          break;
        case 'l':
          System.out.println("Please enter your information as the format below:");
          System.out.println("id,password,name,email,telephone");
          String userInfo = reader.next();
          String infoArr[] = userInfo.split(",");
          User user = new User(infoArr[0], infoArr[1], infoArr[2], infoArr[3], infoArr[4]);
          loginManager.login(user);
          if (loginManager.isLogged()) {
            System.out.println("login success...");
          }
          utils.showMenu(loginManager);
          break;
        case 'o':
          if (loginManager.isLogged()) {
            loginManager.logout();
            System.out.println("logout success...");
          } else {
            System.out.println("Select a valid option!");
          }
          utils.showMenu(loginManager);
          break;
        default:
          System.out.println("Select a valid option!");
          utils.showMenu(loginManager);
          break;
      }
      System.out.println("················································");
      System.out.println("Enter your option: ");
    }

    System.out.println("-----------------------------------------------");
  }
}
