package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.SeatType;
import com.example.bookmyshow.models.Theatre;
import com.example.bookmyshow.services.TheatreService;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class TheatreController {
    private TheatreService theatreService;
    public TheatreController(TheatreService theatreService)
    {
        this.theatreService=theatreService;
    }
    public Theatre createTheatre(String name, String address, Long id)
    {
        return this.theatreService.createTheatre(name,address,id);
    }
    public Theatre addAuditorium(Long theatreid,String name,int capacity)
    {
        return this.theatreService.addAuditorium(theatreid,name,capacity);
    }
    public void addSeats(Long auditoriumid, Map<SeatType,Integer> seatCollection)
    {
        this.theatreService.addSeats(auditoriumid,seatCollection);
    }
}
