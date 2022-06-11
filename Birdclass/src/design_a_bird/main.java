package design_a_bird;

import java.awt.geom.FlatteningPathIterator;

public class main {
    public static void main(String[] args)
    {
        Bird ostrich=new Ostrich();
        Bird penguin=new Penguin();
        Crow crow=new Crow(new CS_common());
        Sparrow sparrow=new Sparrow(new CS_common());
        sparrow.fly();
        crow.fly();
    }
}
