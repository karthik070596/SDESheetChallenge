package dto;

import models.Ticket;

public class CreateTicketResponseDto extends ResponseDto{
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public CreateTicketResponseDto(ResponseStatus status)
    {
        super(status);
    }
}
