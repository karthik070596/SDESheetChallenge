package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    @Enumerated(EnumType.STRING)
    private Currency currency;
    @ManyToOne
    private Users createdBy;
    @ManyToMany
    private List<Users> participants;
    private String description;
    private Date createdTime;
}
