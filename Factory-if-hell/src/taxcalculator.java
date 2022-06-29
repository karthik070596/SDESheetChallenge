public class taxcalculator {
    public static double calculatetax(taxregime regime,salarydetails details)
    {
        switch(regime)
        {
            case NEW:
                return 0.4*details.getBasic()*details.getHra()*details.getLta();
            case OLD:
                return 0.3*details.getBasic()*details.getHra();
        }
        throw new RuntimeException("Regime not valid"+regime);
    }
}
