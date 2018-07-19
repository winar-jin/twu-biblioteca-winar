package com.twu.biblioteca;

/**
 * Created by jin on 19/07/2018.
 */
public class LoginManager {
  static private User loginUser;

  public boolean isLogged() {
    return loginUser != null;
  }

  public void login(User user) {
    loginUser = user;
  }

  public void logout() {
    loginUser = null;
  }

  public String getLoginedUserInfo() {
    if (loginUser != null) {
      return loginUser.getUserInfo();
    }
    return "Please login first...";
  }
}
