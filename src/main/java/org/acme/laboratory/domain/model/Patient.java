package org.acme.laboratory.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Patient extends PanacheEntity{
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;

  private String name;
  private String Lastname;
  private String SecondName;
  private String address;
  private String phone;

  public Patient(){}

  public Patient(String name, String Lastname, String SecondName, String address, String phone){
    this.name = name;
    this.Lastname = Lastname;
    this.SecondName = SecondName;
    this.address = address;
    this.phone = phone;
  }

  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getLastName(){
    return Lastname;
  }

  public void setLastName(String Lastname){
    this.Lastname = Lastname;
  }

  public String getSecondName(){
    return SecondName;
  }

  public void setSecondName(String SecondName){
    this.SecondName = SecondName;
  }

  public String getAddress(){
    return address;
  }

  public void setAddrees(String address){
    this.address = address;
  }

  public String getPhone(){
    return phone;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }
}
