public class oldregime implements taxcalculation{
    @Override
    public double calculatetax(salarydetails details) {
        return 0.3*details.getBasic()*details.getHra();
    }
}
