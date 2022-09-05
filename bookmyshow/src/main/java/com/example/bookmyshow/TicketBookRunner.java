package com.example.bookmyshow;

import com.example.bookmyshow.controllers.TicketController;
import com.example.bookmyshow.exception.SeatNotAvailable;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.repository.ShowRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import com.example.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class TicketBookRunner implements Runnable{
    private TicketController ticketController;
    private Long showid;
    private Long userid;
    private Date timeofBooking;
    private List<Long> id;

    public TicketBookRunner(TicketController ticketController,Long showid,Long userid,Date timeofBooking,List<Long>id)
    {
      this.showid=showid;
      this.userid=userid;
      this.timeofBooking=timeofBooking;
      this.id=id;
      this.ticketController=ticketController;
    }

    @Override
    public void run() {
        try
        {
            this.ticketController.bookTicket(showid,userid,timeofBooking,id);
        }
        catch (SeatNotAvailable exception)
        {
            System.out.println("Exception: " + exception.getMessage());
        }

    }
}
