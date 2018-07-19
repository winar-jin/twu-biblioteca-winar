package com.twu.biblioteca;

/**
 * Created by jin on 19/07/2018.
 */
public class User {
  private String id;
  private String name;
  private String pwd;
  private String email;
  private String telephone;

  public User(String id, String pwd, String name, String email, String telephone) {
    this.id = id;
    this.pwd = pwd;
    this.name = name;
    this.email = email;
    this.telephone = telephone;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getUserInfo() {
    return String.format("%-10s | %-10s | %-10s | %-20s | %-11s", getId(), getPwd(), getName(), getEmail(), getTelephone());
  }
}
