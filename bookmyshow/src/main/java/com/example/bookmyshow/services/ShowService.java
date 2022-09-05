package com.example.bookmyshow.services;

import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repository.AuditoriumRepository;
import com.example.bookmyshow.repository.ShowRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShowService {

    private AuditoriumRepository auditoriumRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    @Autowired
    public ShowService(AuditoriumRepository auditoriumRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository)
    {
        this.auditoriumRepository=auditoriumRepository;
        this.showRepository=showRepository;
        this.showSeatRepository=showSeatRepository;
    }
    public Show createShow(Long auditoriumid, Language language,Date start, Date end)
    {
        Auditorium auditorium=this.auditoriumRepository.findById(auditoriumid).get();
        Show show=new Show();
        show.setAuditorium(auditorium);
        show.setStarttime(start);
        show.setEndtime(end);
        show.setLanguage(language);
        Show savedShow=this.showRepository.save(show);
        List<ShowSeat> showseats=new ArrayList<>();
        for(Seat seat:auditorium.getSeat())
        {
            ShowSeat showSeat=new ShowSeat();
            showSeat.setShow(savedShow);
            showSeat.setSeat(seat);
            showSeat.setStatus(SeatStatus.AVAILABLE);
            showseats.add(showSeat);
        }
        List<ShowSeat>savedshowseats=this.showSeatRepository.saveAll(showseats);
        savedShow.setShowSeat(savedshowseats);
        return this.showRepository.save(savedShow);
    }
}
