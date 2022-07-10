import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Bullets fivemm=new Bullets();
        BulletRegistry b=new BulletRegistry();
        b.addRegistry(BulletType.fivemm,fivemm);
        Bullets sevenmm=new Bullets();
        List<FlyingBullet> flyingbullets=new ArrayList<>();
        for(int i=0;i<20000;i++)
        {
            FlyingBullet flying=new FlyingBullet();
            flying.setBullet(b.getRegistry(BulletType.fivemm));
            flyingbullets.add(flying);
        }
        System.out.println("DEMO");
    }
}
