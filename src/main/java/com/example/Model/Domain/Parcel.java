package com.example.Model.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Parcel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private Date postingDate;
    private Date receivingDate;
    @OneToOne
    @NotNull
    @JoinColumn(name = "posting_address_id")
    private Address postingAddress;
    @OneToOne
    @NotNull
    @JoinColumn(name = "receiving_address_id")
    private Address receivingAddress;

    public Parcel(){}

    public Parcel(Date postingDate, Address postingAddress, Address receivingAddress){
        this.postingDate = postingDate;
        this.postingAddress = postingAddress;
        this.receivingAddress = receivingAddress;
    }
    public Parcel(Date postingDate, Date receivingDate, Address postingAddress, Address receivingAddress){
        this.postingDate = postingDate;
        this.receivingDate = receivingDate;
        this.postingAddress = postingAddress;
        this.receivingAddress = receivingAddress;
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
}