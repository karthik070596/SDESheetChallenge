package design_a_bird;

public class Sparrow extends Bird implements Flyable{
    private Flyable f;
    Sparrow(Flyable f)
    {
        this.f=f;
    }

    @Override
    public void fly() {
        this.f.fly();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }
}
