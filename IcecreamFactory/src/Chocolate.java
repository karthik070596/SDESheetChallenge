public class Chocolate implements Icecream{
    private Icecream icecream;
    Chocolate(Icecream icecream)
    {
        this.icecream=icecream;
    }
    @Override
    public int getRate() {
        return 25+icecream.getRate();
    }

    @Override
    public String getConstituents() {
         return "Chocolate"+icecream.getConstituents();
    }
}
