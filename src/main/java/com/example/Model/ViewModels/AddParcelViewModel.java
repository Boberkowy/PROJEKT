package com.example.Model.ViewModels;

import java.sql.Date;

/**
 * Created by Boberkowy on 17.01.2017.
 */
public class AddParcelViewModel {


  private String postingRegion;
  private String postingCity;
  private String postingZipcode;
  private String postingStreet;
  private String postingNumber;
  private String receivingRegion;
  private String receivingCity;
  private String receivingZipcode;
  private String receivingStreet;
  private String receivingNumber;


  public String getPostingRegion() {
    return postingRegion;
  }
  public void setPostingRegion(String postingRegion) {
    this.postingRegion = postingRegion;
  }
  public String getPostingCity() {
    return postingCity;
  }
  public void setPostingCity(String postingCity) {
    this.postingCity = postingCity;
  }
  public String getPostingNumber() {
    return postingNumber;
  }
  public void setPostingNumber(String postingNumber) {
    this.postingNumber = postingNumber;
  }
  public String getPostingStreet() {
    return postingStreet;
  }
  public void setPostingStreet(String postingStreet) {
    this.postingStreet = postingStreet;
  }
  public String getPostingZipcode() {
    return postingZipcode;
  }
  public void setPostingZipcode(String postingZipcode) {
    this.postingZipcode = postingZipcode;
  }
    public String getReceivingRegion() {
        return receivingRegion;
    }
    public void setReceivingRegion(String receivingRegion) {
    this.receivingRegion = receivingRegion;
  }
  public String getReceivingCity() {
    return receivingCity;
  }
  public void setReceivingCity(String receivingCity) {
    this.receivingCity = receivingCity;
  }
  public String getReceivingNumber() {
    return receivingNumber;
  }
  public void setReceivingNumber(String receivingNumber) {
    this.receivingNumber = receivingNumber;
  }
  public String getReceivingStreet() {
    return receivingStreet;
  }
  public void setReceivingStreet(String receivingStreet) {
    this.receivingStreet = receivingStreet;
  }
  public String getReceivingZipcode() {
    return receivingZipcode;
  }
  public void setReceivingZipcode(String receivingZipcode) {
    this.receivingZipcode = receivingZipcode;
  }
}
