package com.security.user_service.payload.request;

import java.util.Set;

public class SignupRequest {

  private String username;
  private String email;
  private String password;
  private Set<String> role;

  public Set<String> getRole() {
    return role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }

  public SignupRequest() {
  }

  public SignupRequest(String username, String email, String password, Set<String> role) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "SigupRequest [username=" + username + ", email=" + email + ", password=" + password + "]";
  }

}
