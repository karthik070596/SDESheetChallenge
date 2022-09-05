import Service.ParkingLotService;
import Service.TicketService;
import controller.ParkingLotController;
import controller.TicketController;
import dto.*;
import models.*;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import strategy.RandomSpotAssignmentStrategy;
import strategy.SpotAssignmentStrategy;

public class Client {
    public static void main(String[] args) {

        ObjectRegistry objectRegistry=new ObjectRegistry();
        objectRegistry.addRegistry("repository",  new ParkingLotRepository());
        objectRegistry.addRegistry("service",new ParkingLotService((ParkingLotRepository) objectRegistry.getRegistry("repository")));
        objectRegistry.addRegistry("controller",new ParkingLotController((ParkingLotService)objectRegistry.getRegistry("service")));

        objectRegistry.addRegistry("ticketrepository",new TicketRepository());
        objectRegistry.addRegistry("spotassignmentstrategy",new RandomSpotAssignmentStrategy());
        objectRegistry.addRegistry("ticketservice",new TicketService((TicketRepository)objectRegistry.getRegistry("ticketrepository"),(SpotAssignmentStrategy)objectRegistry.getRegistry("spotassignmentstrategy"),(ParkingLotRepository)objectRegistry.getRegistry("repository")));
        objectRegistry.addRegistry("ticketcontroller",new TicketController((TicketService)objectRegistry.getRegistry("ticketservice")));
        CreateParkingLotRequestDto createParkingLotRequestDto=new CreateParkingLotRequestDto();
        createParkingLotRequestDto.setNumberOfFloor(3);
        createParkingLotRequestDto.setAddress("Delhi/NCR");
        ParkingLotController parkingLotController=(ParkingLotController) objectRegistry.getRegistry("controller");
        CreateParkingLotResponseDto createParkingLotResponseDto=parkingLotController.createParkingLot(createParkingLotRequestDto);
        if(createParkingLotResponseDto.getStatus().equals(ResponseStatus.FAILURE))
            System.out.println("Something wrong occurred");
        else
            System.out.println(createParkingLotResponseDto);

        UpdateParkingLotRequestDto updateParkingLotRequestDto=new UpdateParkingLotRequestDto();
        updateParkingLotRequestDto.setId(1L);
        updateParkingLotRequestDto.setAddress("Tamilnadu");
        UpdateParkingLotResponseDto updateParkingLotResponseDto=parkingLotController.updateAddress(updateParkingLotRequestDto);
        System.out.println(updateParkingLotResponseDto.getParkingLot());

        CreateTicketRequestDto createTicketRequestDto=new CreateTicketRequestDto();
        Operator operator=new Operator();
        operator.setName("Shanmugi");
        EntryGate entryGate=new EntryGate(GateStatus.OPEN,operator,1);
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleType(VehicleType.SMALL);
        vehicle.setNumber("4558");
        createTicketRequestDto.setId(1L);
        createTicketRequestDto.setEntryGate(entryGate);
        createTicketRequestDto.setOwnerName("Karthikeyan");
        createTicketRequestDto.setVehicle(vehicle);
        createTicketRequestDto.setSpotType(SpotType.SMALL);
        TicketController ticketController=(TicketController)objectRegistry.getRegistry("ticketcontroller");
        CreateTicketResponseDto createTicketResponseDto=ticketController.createTicket(createTicketRequestDto);
        if(createTicketResponseDto.getStatus().equals(ResponseStatus.FAILURE))
            System.out.println("Parking Spots are full! Please visit later");
        else
            System.out.println(createTicketResponseDto.getTicket());
    }
}
