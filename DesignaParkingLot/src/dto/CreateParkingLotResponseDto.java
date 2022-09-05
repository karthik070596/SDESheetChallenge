package dto;

import models.ParkingLot;

public class CreateParkingLotResponseDto extends ResponseDto {
    private ParkingLot parkingLot;

    public CreateParkingLotResponseDto(ResponseStatus status)
    {
        super(status);
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }


}
