public class taxcalculate {
    public static taxalgorithm decidetax(taxregime regime)
    {
        switch(regime)
        {
            case NEW:
                return new newregime();
            case OLD:
                return new oldregime();
        }
        throw new RuntimeException("Regime not valid"+regime);
    }
}
