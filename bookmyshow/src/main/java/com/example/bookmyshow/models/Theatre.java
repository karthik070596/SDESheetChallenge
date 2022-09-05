package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
    @OneToMany(mappedBy = "theatre",fetch = FetchType.EAGER)
    private List<Auditorium> auditorium;
    @OneToMany
    private List<Show>show;
}
