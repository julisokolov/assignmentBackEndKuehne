package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String registrationCode;
  private String fullName;
  private String email;
  private String telephone;

  public Customer() {}

  public Customer(String registrationCode, String fullName, String email, String telephone) {
    this.registrationCode = registrationCode;
    this.fullName = fullName;
    this.email = email;
    this.telephone = telephone;
  }

  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRegistrationCode() {
    return registrationCode;
  }

  public void setRegistrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
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
}