package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Groups extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Users> participants;
    @ManyToMany
    private List<Users>admin;
    @ManyToOne
    private Users createdBy;
    private Date createdTime;
}
