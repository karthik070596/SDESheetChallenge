package repository;

import models.ParkingLot;
import models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Long, Ticket> TicketRegistry=new HashMap<>();
    Long id=0L;
    public Ticket saveTicket(Ticket ticket)
    {
        id+=1;
        ticket.setId(id);
        TicketRegistry.put(id,ticket);
        return TicketRegistry.get(id);
    }
    public Ticket get(Long id)
    {
        return TicketRegistry.get(id);
    }
}
