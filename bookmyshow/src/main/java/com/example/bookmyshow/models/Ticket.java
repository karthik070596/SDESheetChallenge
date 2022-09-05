package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private double amount;
    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    @ManyToOne
    private Show show;
    private Date TimeofBooking;
    @ManyToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private User bookedBy;

}
