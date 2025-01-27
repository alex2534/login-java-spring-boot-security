package com.security.user_service.payload.response;

import java.util.List;

public class JwtResponse {

  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String email;
  private List<String> roles;

  public JwtResponse() {
  }

  public JwtResponse(String token, String type, Long id, String username, String email, List<String> roles) {
    this.token = token;
    this.type = type;
    this.id = id;
    this.username = username;
    this.email = email;
    this.roles = roles;
  }

  public JwtResponse(String jwt, Long id2, String username2, String email2, List<String> roles2) {
    this.email = email2;
    this.id = id2;
    this.roles = roles2;
    this.token = jwt;
    this.username = username2;

  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  @Override
  public String toString() {
    return "JwtResponse [token=" + token + ", type=" + type + ", id=" + id + ", username=" + username + ", email="
        + email + ", roles=" + roles + "]";
  }

}
