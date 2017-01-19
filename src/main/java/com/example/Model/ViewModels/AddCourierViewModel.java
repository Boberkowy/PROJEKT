package com.example.Model.ViewModels;

/**
 * Created by Boberkowy on 17.01.2017.
 */
public class AddCourierViewModel {

  private long courierId;
  private long parcelId;

  public long getCourierId() {
    return courierId;
  }

  public void setCourierId(long courierId) {
    this.courierId = courierId;
  }

  public long getParcelId() {
    return parcelId;
  }

  public void setParcelId(long parcelId) {
    this.parcelId = parcelId;
  }
}
