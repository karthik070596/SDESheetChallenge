package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @Enumerated(EnumType.STRING)
    private Language language;
    private Date starttime;
    private Date endtime;
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeat;
    @OneToMany
    private List<ShowSeatType>showSeatType;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeatures>showFeatures;
}
