package com.example.bookmyshow.services;

import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repository.AuditoriumRepository;
import com.example.bookmyshow.repository.CityRepository;
import com.example.bookmyshow.repository.SeatRepository;
import com.example.bookmyshow.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TheatreService {
    private TheatreRepository theatreRepository;
    private AuditoriumRepository auditoriumRepository;
    private CityRepository cityRepository;
    private SeatRepository seatRepository;
    public TheatreService(TheatreRepository theatreRepository, CityRepository cityRepository,AuditoriumRepository auditoriumRepository,SeatRepository seatRepository)
    {
        this.theatreRepository=theatreRepository;
        this.cityRepository=cityRepository;
        this.auditoriumRepository=auditoriumRepository;
        this.seatRepository=seatRepository;
    }

    public Theatre createTheatre(String name, String address, Long id) {
        Optional<City>dbCityOptional=this.cityRepository.findById(id);
        if(dbCityOptional.isEmpty())
            throw new RuntimeException("City ID is null please try again");
        Theatre theatre=new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);
        Theatre createdTheatre=this.theatreRepository.save(theatre);
        City dbCity= dbCityOptional.get();
        if(dbCity.getTheatre()==null)
            dbCity.setTheatre(new ArrayList<>());
        dbCity.getTheatre().add(createdTheatre);
        this.cityRepository.save(dbCity);
        return createdTheatre;

    }
    public Theatre addAuditorium(Long theatreid,String name,int capacity)
    {
        Theatre theatre=this.theatreRepository.findById(theatreid).get();
        Auditorium auditorium=new Auditorium();
        auditorium.setName(name);
        auditorium.setCapacity(capacity);
        auditorium.setTheatre(theatre);
        Auditorium createdAuditorium=this.auditoriumRepository.save(auditorium);
        theatre.getAuditorium().add(createdAuditorium);
        return this.theatreRepository.save(theatre);
    }
    public void addSeats(Long auditoriumid, Map<SeatType,Integer>seatCollection)
    {
        Auditorium auditorium=this.auditoriumRepository.findById(auditoriumid).get();
        List<Seat> seatList=new ArrayList<>();
        for(Map.Entry<SeatType,Integer>entry:seatCollection.entrySet())
        {
            for(int i=0;i<entry.getValue();i++)
            {
                Seat seat=new Seat();
                seat.setType(entry.getKey());
                seat.setNumber(entry.getKey().toString() + Integer.toString(i+1));
                seatList.add(seat);
            }
        }
        List<Seat>savedSeatList=this.seatRepository.saveAll(seatList);
        auditorium.setSeat(savedSeatList);
        Auditorium savedAuditorium=this.auditoriumRepository.save(auditorium);

    }
}
