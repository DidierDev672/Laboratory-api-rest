package org.acme.laboratory.infrastructure.interfaces.web;

public class PatentDto {
  private Long id;
  private String name;
  private String Lastname;
  private String SecondName;
  private String address;
  private String phone;

  public PatentDto(){}

  public PatentDto(Long id, String name, String Lastname, String SecondName, String address, String phone){
    this.id = id;
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

  public void setAddress(String address){
    this.address = address;
  }

  public String getPhone(){
    return phone;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }
}
