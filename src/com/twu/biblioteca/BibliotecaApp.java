package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
  static Utils utils = new Utils();
  static LoginManager loginManager = new LoginManager();
  static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    utils.intiBooks();
    utils.initMovies();
    System.out.println("Hello, Welcome to The Bangalore Public Library!");
    System.out.println("-----------------------------------------------");
    utils.showMenu(loginManager);
    System.out.println("················································");
    System.out.println("Enter your option: ");
    char option;
    while ((option = reader.next().charAt(0)) != 'e') {
      switch (option) {
        case 'b':
          utils.listBooks();
          utils.showMenu(loginManager);
          break;
        case 'm':
          utils.listMovies();
          utils.showMenu(loginManager);
          break;
        case 'c':
          if (!loginManager.isLogged()) {
            System.out.println("Select a valid option!");
            utils.showMenu(loginManager);
            break;
          }
          utils.listBooks();
          System.out.println("Please enter the number of book that you want to checkout");
          String bookNoToCheckout = reader.next();
          String bookInfo = utils.getBookInfo(bookNoToCheckout);
          System.out.println(bookInfo);
          if (!bookInfo.equals("That book is not available.")) {
            System.out.println("Are you sure the book is what you want? (Y/N)");
            String confirm = reader.next();
            if (confirm.equals("Y") && utils.checkoutBook(bookNoToCheckout)) {
              System.out.println("Thank you! Enjoy the book");
            } else {
              System.out.println("Checkout cancel...");
            }
          }
          utils.showMenu(loginManager);
          break;
        case 'r':
          if (!loginManager.isLogged()) {
            System.out.println("Select a valid option!");
            utils.showMenu(loginManager);
            break;
          }
          System.out.println("Please enter the number of book that you want to return");
          String bookNoToReturn = reader.next();
          String bookInfoToReturn = utils.getBookInfo(bookNoToReturn);
          System.out.println(bookInfoToReturn);
          if (!bookInfoToReturn.equals("That book is not available.")) {
            System.out.println("Are you sure the book is what you want to return? (Y/N)");
            String confirm = reader.next();
            if (confirm.equals("Y") && utils.returnBook(bookNoToReturn)) {
              System.out.println("Thank you for returning the book.");
            } else {
              System.out.println("That is not a valid book to return...");
            }
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
