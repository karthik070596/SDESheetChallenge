public class GoogleMaps {
    Pathregistry pathregistry;
    GoogleMaps(Pathregistry pathregistry)
    {
        this.pathregistry=pathregistry;
    }
    public void findRoute(String from, String to,Transportmode mode)
    {
       Pathcalculationstrategy pathcalculationstrategy= pathregistry.getRegistry(mode);
       pathcalculationstrategy.pathcalculation(from,to);
    }
}
