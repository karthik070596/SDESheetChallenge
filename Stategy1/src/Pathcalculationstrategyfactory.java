public class Pathcalculationstrategyfactory {
    public Pathcalculationstrategy getMode(Transportmode mode)
    {
        if(mode==Transportmode.BIKE)
            return new Bikecalculationstrategy();
        else if(mode==Transportmode.CAR)
            return new Carcalculationstrategy();
        else if(mode==Transportmode.WALK)
            return new Walkcalculationstrategy();
        return null;
    }
}
