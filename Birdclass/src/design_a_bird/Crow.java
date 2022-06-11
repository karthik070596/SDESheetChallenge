package design_a_bird;

public class Crow extends Bird implements Flyable{
    private Flyable f;
    Crow(Flyable f)
    {
        this.f=f;
    }

    @Override
    public void fly() {
        this.f.fly();
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }

    @Override
    public void eat() {
        super.eat();
    }

}
