package repository;
import models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Long,ParkingLot>parkingLotRegistry=new HashMap<>();
    Long id=0L;
    public ParkingLot save(ParkingLot parkingLot)
    {
        id+=1;
        parkingLot.setId(id);
        parkingLotRegistry.put(id,parkingLot);
        return parkingLot;
    }
    public ParkingLot get(Long id)
    {
        return parkingLotRegistry.get(id);
    }
    public ParkingLot update(Long id,ParkingLot parkingLot)
    {
        parkingLotRegistry.put(id,parkingLot);
        return parkingLotRegistry.get(id);
    }
}
