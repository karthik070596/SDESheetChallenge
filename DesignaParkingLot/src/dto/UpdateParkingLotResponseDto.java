package dto;

import models.ParkingLot;

public class UpdateParkingLotResponseDto extends ResponseDto{
    private ParkingLot parkingLot;

    public UpdateParkingLotResponseDto(ResponseStatus responseStatus)
    {
        super(responseStatus);
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
