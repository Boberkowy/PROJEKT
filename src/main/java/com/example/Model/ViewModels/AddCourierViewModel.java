package com.example.Model.ViewModels;

/**
 * Created by Boberkowy on 17.01.2017.
 */
public class AddCourierViewModel {

  private String courierId;
  private String parcelId;

  public String getCourierId() {
    return courierId;
  }

  public void setCourierId(String courierId) {
    this.courierId = courierId;
  }

  public String getParcelId() {
    return parcelId;
  }

  public void setParcelId(String parcelId) {
    this.parcelId = parcelId;
  }
}
