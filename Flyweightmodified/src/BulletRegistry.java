import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType,Bullets> bulletstorage=new HashMap<>();
    public void addRegistry(BulletType type, Bullets bullet) {
        bulletstorage.put(type, bullet);
    }
    public Bullets getRegistry(BulletType type)
    {
        return bulletstorage.get(type);
    }
}
