import java.util.HashMap;
import java.util.Map;

public class Pathregistry {
    private Map<Transportmode,Pathcalculationstrategy> pathregistry=new HashMap<>();
    public void putRegistry(Transportmode mode,Pathcalculationstrategy pathcalculationstrategy)
    {
        pathregistry.put(mode,pathcalculationstrategy);
    }
    public Pathcalculationstrategy getRegistry(Transportmode mode)
    {
       return pathregistry.get(mode);
    }
}
