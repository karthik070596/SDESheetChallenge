package com.example.splitwise.commands;

public interface Command {
    public boolean canExecute(String input);
    public void execute(String input);
}
