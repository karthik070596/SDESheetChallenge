public class createnewregime extends taxation{
    @Override
    taxcalculation regimeselection() {
        return new newregime();
    }
}
