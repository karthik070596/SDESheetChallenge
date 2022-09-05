package com.example.bookmyshow.controllers;

import com.example.bookmyshow.exception.SeatNotAvailable;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }
    public Ticket bookTicket(Long showid, Long userid, Date timeofBooking, List<Long> id) throws SeatNotAvailable
    {
        return this.ticketService.bookTicket(showid,userid,timeofBooking,id);
    }
}
