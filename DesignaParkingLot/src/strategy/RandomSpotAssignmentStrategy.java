package strategy;

import models.*;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle,SpotType spotType) {
        for(ParkingFloor parkingfloors:parkingLot.getParkingFloors())
        {
           for(ParkingSpot parkingSpot:parkingfloors.getParkingSpots())
           {
               if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) && parkingSpot.getSpotType().equals(spotType))
                   return parkingSpot;

           }
        }
        return null;
    }
}
