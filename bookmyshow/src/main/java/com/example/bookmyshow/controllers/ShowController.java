package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.Language;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.services.ShowService;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ShowController {
    private ShowService showService;
    public ShowController(ShowService showService)
    {
        this.showService=showService;
    }
    public Show createShow(Long auditoriumid, Language language, Date start, Date end) {
        return this.showService.createShow(auditoriumid,language,start,end);
    }
}
