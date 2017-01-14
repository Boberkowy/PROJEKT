package com.example.Model.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Parcel{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parcel_id", unique = true)
    private int id;

    private Date postingDate;
    private Date receivingDate;
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address postingAddress;
    @OneToOne
    @JoinColumn(name = "addressId",insertable = false, updatable = false)
    private Address receivingAddress;
    @NotNull
    private String status;

    public Parcel(){

    }

    public Parcel(Date postingDate, Address postingAddress, Address receivingAddress, String status){
        this.setReceivingDate(postingDate);
        this.setPostingAddress(postingAddress);
        this.setReceivingAddress(receivingAddress);
        this.setStatus(status);
    }
    public Parcel(Date postingDate, Date receivingDate, Address postingAddress, Address receivingAddress, String status){
        this.setPostingDate(postingDate);
        this.setReceivingDate(receivingDate);
        this.setPostingAddress(postingAddress);
        this.setReceivingAddress(receivingAddress);
        this.setStatus(status);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getPostingDate() {
        return postingDate;
    }
    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    public Date getReceivingDate() {
        return receivingDate;
    }
    public void setReceivingDate(Date receivingDate) {
        this.receivingDate = receivingDate;
    }

    public Address getPostingAddress() {
        return postingAddress;
    }
    public void setPostingAddress(Address postingAddress) {
        this.postingAddress = postingAddress;
    }

    public Address getReceivingAddress() {
        return receivingAddress;
    }
    public void setReceivingAddress(Address receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
