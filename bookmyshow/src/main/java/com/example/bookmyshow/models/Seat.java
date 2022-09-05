package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String number;
    @Enumerated(EnumType.STRING)
    private SeatType type;
}
