package com.example.bookmyshow.services;

import com.example.bookmyshow.exception.SeatNotAvailable;
import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repository.ShowRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import com.example.bookmyshow.repository.TicketRepository;
import com.example.bookmyshow.repository.UserRepository;
import com.zaxxer.hikari.util.IsolationLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;

@Service
public class TicketService {
    private ShowRepository showRepository;
    private UserRepository userRepository;
    private ShowSeatRepository showSeatRepository;
    private TicketRepository ticketRepository;
    @Autowired

    public TicketService(ShowRepository showRepository,ShowSeatRepository showSeatRepository, TicketRepository ticketRepository,UserRepository userRepository)
    {
        this.showRepository=showRepository;
        this.ticketRepository=ticketRepository;
        this.showSeatRepository=showSeatRepository;
        this.userRepository=userRepository;
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(Long showid, Long userid, Date timeofbooking, List<Long>showseatid) throws SeatNotAvailable
    {
        Ticket ticket=new Ticket();
        User user=this.userRepository.findById(userid).get();
        Show show=this.showRepository.findById(showid).get();
        List<ShowSeat>showSeats=this.showSeatRepository.findByIdIn(showseatid);
        for(ShowSeat data:showSeats)
        {
            if(data.getStatus()== SeatStatus.BOOKED)
                throw new SeatNotAvailable("ShowSeat ID: " +
                        data.getId() + " not available.");

        }
        for(ShowSeat data:showSeats) {
           data.setStatus(SeatStatus.BOOKED);
           this.showSeatRepository.save(data);
        }
        ticket.setBookedBy(user);
        ticket.setTimeofBooking(timeofbooking);
        ticket.setShow(show);
        ticket.setStatus(TicketStatus.PENDING);
        ticket.setShowSeat(showSeats);
        return this.ticketRepository.save(ticket);
    }
}
