package design_a_bird;

public class Pigeon extends Bird implements Flyable{

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }

    @Override
    public void fly() {
        System.out.println("Pigeons can fly");
    }

}
