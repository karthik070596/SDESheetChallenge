package Service;

import models.ParkingLot;
import repository.ParkingLotRepository;

public class ParkingLotService {
    ParkingLotRepository parkingLotRepository;
    public ParkingLotService(ParkingLotRepository parkingLotRepository)
    {
        this.parkingLotRepository=parkingLotRepository;
    }
    public ParkingLot createParkingLot(ParkingLot parkingLot)
    {
        return parkingLotRepository.save(parkingLot);
    }
    public ParkingLot updateParkingLot(Long id,String address)
    {
        ParkingLot currParkingLot=parkingLotRepository.get(id);
        currParkingLot.setAddress("Tamilnadu");
        return parkingLotRepository.update(id,currParkingLot);

    }
}
