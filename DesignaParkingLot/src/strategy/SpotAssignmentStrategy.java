package strategy;


import models.ParkingLot;
import models.ParkingSpot;
import models.SpotType;
import models.Vehicle;

public interface SpotAssignmentStrategy {
    public ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle, SpotType spotType);

}
