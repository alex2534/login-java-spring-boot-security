package com.security.user_service.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERoleEntity name;

  public RoleEntity() {
  }

  public RoleEntity(Integer id, ERoleEntity name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ERoleEntity getName() {
    return name;
  }

  public void setName(ERoleEntity name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "RoleEntity [id=" + id + ", name=" + name + "]";
  }

}
