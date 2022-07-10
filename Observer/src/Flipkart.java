import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart {
    private static Map<Events, List<Subscriber>> subscribers=new HashMap<>();


    public static void registerSubscriber(Events events,Subscriber subscriber)
    {
        if(!subscribers.containsKey(events))
          subscribers.put(events,new ArrayList<>());
        subscribers.get(events).add(subscriber);
    }
    public void notify(Events events,Order order)
    {
        for(Subscriber subscriber:subscribers.get(events))
        {
           subscriber.listen(events,order);
        }
    }

    public void order(Order order) {
        this.notify(Events.ORDERPLACED,order);
    }
}
