import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        bird b = new bird();
        b.setColor("green");
        b.setName("breaker");
        b.setWeight(90);
        sparrow s = new sparrow();
        s.setLegsize(100);
        crow c=new crow();
        c.setSound("kaw");
        List<bird>birds=List.of(
                b,
                s,
                c
        );
        List<bird>children=new ArrayList<>();
        for(bird parent:birds)
        {
            children.add(parent.clone());
        }
        sparrow longLeggedSparrow = new sparrow();
        longLeggedSparrow.setLegsize(1000);

        crow sweetSoundCrow = new crow();
        sweetSoundCrow.setSound("kookoo");

        registry birdRegistry = new registry();
        birdRegistry.addRegistry("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.addRegistry("longLeggedSparrow", longLeggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longLeggedSparrow",
                "sweetSoundCrow"
        );

        List<bird> requestedBirds = new ArrayList<>();

        for (String type: getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getRegistry(type));
        }

        System.out.println("Done");
    }

    };

