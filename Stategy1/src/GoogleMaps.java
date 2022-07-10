public class GoogleMaps {
    public void findPath(String from, String to,Transportmode mode)
    {
        Pathcalculationstrategyfactory pathcalculationstrategyfactory=new Pathcalculationstrategyfactory();
        Pathcalculationstrategy pathcalculationstrategy=pathcalculationstrategyfactory.getMode(mode);
        pathcalculationstrategy.pathcalculation(from,to);
    }
}
