package controller;

import Service.TicketService;
import dto.CreateTicketRequestDto;
import dto.CreateTicketResponseDto;
import dto.ResponseStatus;
import models.Ticket;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService)
    {
        this.ticketService=ticketService;
    }
    public CreateTicketResponseDto createTicket(CreateTicketRequestDto request)
    {

        Ticket createdTicket=ticketService.createTicket(request.getId(),request.getOwnerName(),request.getVehicle(),request.getEntryGate(),request.getSpotType());
        if(createdTicket==null)
        {
            CreateTicketResponseDto createTicketResponseDto=new CreateTicketResponseDto(ResponseStatus.FAILURE);
            return createTicketResponseDto;
        }
        CreateTicketResponseDto createTicketResponseDto=new CreateTicketResponseDto(ResponseStatus.SUCCESS);
        createTicketResponseDto.setTicket(createdTicket);
        return  createTicketResponseDto;
    }
}
