package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    @ManyToOne
    private Ticket ticket;
    private Date TimeofPayment;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private double amount;
    private String referenceid;
}
