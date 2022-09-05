package Service;

import models.*;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import strategy.SpotAssignmentStrategy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;
    public TicketService(TicketRepository ticketrepository,SpotAssignmentStrategy spotAssignmentStrategy,ParkingLotRepository parkingLotRepository)
    {
        this.ticketRepository=ticketrepository;
        this.spotAssignmentStrategy=spotAssignmentStrategy;
        this.parkingLotRepository=parkingLotRepository;
    }
    public Ticket createTicket(Long id, String ownerName, Vehicle vehicle, EntryGate entryGate, SpotType spotType)
    {
        ParkingLot parkingLot=parkingLotRepository.get(id);
        if(parkingLot==null)
            return null;
        ParkingSpot spot=spotAssignmentStrategy.assignSpot(parkingLot,vehicle,spotType);
        if(spot==null)
            return null;
        Ticket ticket=new Ticket();
        ticket.setEntryTime(String.valueOf(LocalDateTime.now()));
        ticket.setEntryGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setOwnerName(ownerName);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(spot);
        Ticket createdTicket=ticketRepository.saveTicket(ticket);
        return ticket;

    }

}
