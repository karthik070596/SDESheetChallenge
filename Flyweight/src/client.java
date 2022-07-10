import java.util.ArrayList;
import java.util.List;

public class client {
    public static void main(String[] args) {


        List<bullet> bullets = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
           bullet b=new bullet();
           b.setImage(new byte[1000]);
           bullets.add(b);
        }

    }
}
