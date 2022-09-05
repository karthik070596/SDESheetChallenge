package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Getter
@Setter
public class UserExpensePaidBy {
    @ManyToOne
    private Users user;
    @ManyToOne
    private Expense expense;
    private double amount;
}
