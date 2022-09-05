package controller;

import Service.ParkingLotService;
import dto.*;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLotController {
    ParkingLotService parkingLotService;
    public ParkingLotController(ParkingLotService parkingLotService)
    {
        this.parkingLotService=parkingLotService;
    }
    public CreateParkingLotResponseDto createParkingLot(CreateParkingLotRequestDto request)
    {
        Scanner scanner=new Scanner(System.in);
        CreateParkingLotResponseDto response;
        if(request.getNumberOfFloor()<2){
            response=new CreateParkingLotResponseDto(ResponseStatus.FAILURE);
            return response;
        }
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setAddress(request.getAddress());
        List<ParkingFloor> parkingFloors=new ArrayList<>();
        for(int i=0;i<request.getNumberOfFloor();i++)
        {
            parkingFloors.add(new ParkingFloor(i));
        }
        for(ParkingFloor floor:parkingFloors) {
            List<ParkingSpot>parkingSpots=new ArrayList<>();
            System.out.println("Enter the parking spots for the"+ floor.getFloorNumber()+"th"+"floor");
            int input=scanner.nextInt();
            for(int i=0;i<input;i++)
            {
                ParkingSpot spot = new ParkingSpot();
                if(floor.getFloorNumber()==0) {

                    spot.setSpotNumber(i);
                    spot.setSpotType(SpotType.SMALL);
                    spot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                }
                else if(floor.getFloorNumber()==1)
                {
                    spot.setSpotNumber(i);
                    spot.setSpotType(SpotType.MEDIUM);
                    spot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                }
                else {
                    spot.setSpotNumber(i);
                    spot.setSpotType(SpotType.LARGE);
                    spot.setParkingSpotStatus(ParkingSpotStatus.UNAVAILABLE);
                }
                parkingSpots.add(spot);
            }
            floor.setParkingSpots(parkingSpots);
        }
        parkingLot.setParkingFloors(parkingFloors);


        ParkingLot createdParkingLot=parkingLotService.createParkingLot(parkingLot);
        response=new CreateParkingLotResponseDto(ResponseStatus.SUCCESS);
        response.setParkingLot(createdParkingLot);


        return response;

    }

    public UpdateParkingLotResponseDto updateAddress(UpdateParkingLotRequestDto request)
    {
        ParkingLot updatedParkingLot=parkingLotService.updateParkingLot(request.getId(),request.getAddress());
        UpdateParkingLotResponseDto updateParkingLotResponseDto=new UpdateParkingLotResponseDto(ResponseStatus.SUCCESS);
        updateParkingLotResponseDto.setParkingLot(updatedParkingLot);
        return updateParkingLotResponseDto;
    }
}
