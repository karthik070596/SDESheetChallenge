package com.example.bookmyshow;

import com.example.bookmyshow.controllers.*;
import com.example.bookmyshow.dto.CreateUserRequestDto;
import com.example.bookmyshow.dto.CreateUserResponseDto;
import com.example.bookmyshow.models.City;
import com.example.bookmyshow.models.Language;
import com.example.bookmyshow.models.SeatType;
import com.example.bookmyshow.models.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class BookmyshowApplication implements CommandLineRunner {

    private UserController userController;
    private CityController cityController;
    private TheatreController theatreController;
    private ShowController showController;
    private TicketController ticketController;

    @Autowired
    public BookmyshowApplication(UserController userController, CityController cityController, TheatreController theatreController, ShowController showController,TicketController ticketController)
    {
        this.userController=userController;
        this.cityController=cityController;
        this.theatreController=theatreController;
        this.showController=showController;
        this.ticketController=ticketController;
    }
    public static void main(String[] args) {
        SpringApplication.run(BookmyshowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        CreateUserRequestDto createUserRequestDto=new CreateUserRequestDto();
//        createUserRequestDto.setEmail("achanaraja1999@gmail.com");
//        CreateUserResponseDto createUserResponseDto=userController.createUser(createUserRequestDto);
//        System.out.println(createUserResponseDto);
//          City createdCity=this.cityController.createCity("Chennai");
//          System.out.println(createdCity);
//        Theatre createdTheatre=this.theatreController.createTheatre("Vetri","Chrompet",1L);
//        Theatre theatre=this.theatreController.addAuditorium(1L,"McKinsey Hall",1000);
//        Map<SeatType,Integer>seatCollection=new HashMap<>();
//        seatCollection.put(SeatType.GOLD,50);
//        seatCollection.put(SeatType.VIP,10);
//        this.theatreController.addSeats(1L,seatCollection);
//          this.showController.createShow(1L, Language.TAMIL,new Date(),new Date());
         TicketBookRunner ticketBookRunner1=new TicketBookRunner(ticketController,1L,1L,new Date(), List.of(38L,39L,40L));
         Thread t1=new Thread(ticketBookRunner1);
         TicketBookRunner ticketBookRunner2=new TicketBookRunner(ticketController,1L,2L,new Date(), List.of(35L,36L,37L));
         Thread t2=new Thread(ticketBookRunner2);
         t1.start();
         t2.start();
    }

}
