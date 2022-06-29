public class Vanilla implements Icecream{
    private Icecream icecream;

    Vanilla(Icecream icecream)
    {
        this.icecream=icecream;
    }
    @Override
    public int getRate() {
        return 20+icecream.getRate();
    }

    @Override
    public String getConstituents() {
        return "Vanilla"+icecream.getConstituents();
    }
}
