package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
}
