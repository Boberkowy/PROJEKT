package com.example.Model.ViewModels;

import java.sql.Date;

/**
 * Created by Boberkowy on 17.01.2017.
 */
public class AddParcelViewModel {

  private String posting_address;
  private String receiving_address;


  public String getPosting_address() {
    return posting_address;
  }

  public void setPosting_address_id(String posting_address) {
    this.posting_address = posting_address;
  }

  public String getReceiving_address() {
    return receiving_address;
  }

  public void setReceiving_address_id(String receiving_address) {
    this.receiving_address = receiving_address;
  }
}
