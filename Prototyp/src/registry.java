import java.util.HashMap;
import java.util.Map;

public class registry extends bird implements cloneable{
    private Map<String,bird> birds=new HashMap<>();
    public void addRegistry(String name,bird b)
    {
        birds.put(name,b);
    }
    public bird getRegistry(String name)
    {
        return birds.get(name).clone();
    }
}
