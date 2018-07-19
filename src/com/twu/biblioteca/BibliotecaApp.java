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
    System.out.println("Enter your option: ");
    utils.showMenu(loginManager);
    char option;
    while ((option = reader.next().charAt(0)) != 'e') {
      switch (option) {
        case '1':
          utils.listBooks();
          utils.showMenu(loginManager);
          break;
        case '2':
          if (loginManager.isLogged()) {

          } else {
            System.out.println("Select a valid option!");
          }
          break;
        case '3':
          if (loginManager.isLogged()) {

          } else {
            System.out.println("Select a valid option!");
          }
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
    }

    System.out.println("-----------------------------------------------");
  }
}
