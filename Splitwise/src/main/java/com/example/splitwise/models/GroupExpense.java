package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.swing.*;

@Getter
@Setter
@Entity
public class GroupExpense extends BaseModel {
    @ManyToOne
    private Groups group;
    @OneToOne
    private Expense expense;
}
