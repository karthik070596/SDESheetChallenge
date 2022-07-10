public class GoogleMaps {
    public void findPath(String from,String to,Transportmode mode)
    {
        if(mode==Transportmode.Car)
            System.out.println("This is the car route");
        else if(mode==Transportmode.Bike)
            System.out.println("This is the bike route");
        else if(mode==Transportmode.Walk)
            System.out.println("This is the walk route");
    }
}