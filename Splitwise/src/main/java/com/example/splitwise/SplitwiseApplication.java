package com.example.splitwise;

import com.example.splitwise.commands.Command;
import com.example.splitwise.commands.CommandRegistry;
import com.example.splitwise.controllers.UserController;
import com.example.splitwise.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {

    private CommandRegistry commandRegistry;
    private UserController userController;
    @Autowired
    public SplitwiseApplication(CommandRegistry commandRegistry,UserController userController)
    {
        this.commandRegistry=commandRegistry;
        this.userController=userController;
    }
    public static void main(String[] args)
    {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Scanner scanner=new Scanner(System.in);
//        while(true)
//        {
//            String input=scanner.nextLine();
//            commandRegistry.execute(input);
//        }
        this.userController.authenticateUser(3l,"Arcanakarthik@123");

    }
}
