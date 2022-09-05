import models.ParkingLot;

import java.rmi.registry.Registry;
import java.util.HashMap;

public class ObjectRegistry {
    private HashMap<String,Object>registry=new HashMap<>();
    public void addRegistry(String name,Object object)
    {
        registry.put(name,object);
    }
    public Object getRegistry(String name)
    {
        return registry.get(name);
    }
}
