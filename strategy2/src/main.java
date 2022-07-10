public class main {
    public static void main(String[] args) {
        Pathregistry pathregistry=new Pathregistry();
        pathregistry.putRegistry(Transportmode.CAR,new Carcalculationstrategy());
        pathregistry.putRegistry(Transportmode.BIKE,new Bikecalculationstrategy());
        pathregistry.putRegistry(Transportmode.WALK,new Walkcalculationstrategy());
        GoogleMaps googleMaps=new GoogleMaps(pathregistry);
        googleMaps.findRoute("Chennai","Mumbai",Transportmode.BIKE);
    }
}
