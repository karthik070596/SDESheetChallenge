package com.example.splitwise.commands;

import com.example.splitwise.controllers.UserController;
import com.example.splitwise.dto.CreateUserRequestDto;
import com.example.splitwise.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Arrays;
import java.util.List;

@Service
public class RegisterUserCommand implements Command{

    @Autowired
    private UserController userController;
    @Override
    public boolean canExecute(String input) {
        List<String> inputlist= Arrays.stream(input.split(" ")).toList();
        if(inputlist.size()!=4)
            return false;
        if(!inputlist.get(0).equals(CommandKeywords.Register_Command_Keywords))
            return false;
        return true;
    }

    @Override
    public void execute(String input) {
        List<String> inputlist= Arrays.stream(input.split(" ")).toList();
        String name=inputlist.get(1);
        String phonenumber=inputlist.get(2);
        String password=inputlist.get(3);
        CreateUserRequestDto createUserRequestDto=new CreateUserRequestDto();
        createUserRequestDto.setName(name);
        createUserRequestDto.setPhonenumber(phonenumber);
        createUserRequestDto.setPassword(password);
        Users user=this.userController.createUser(createUserRequestDto);
        System.out.println("User created Successfully");
        return;
    }
}
