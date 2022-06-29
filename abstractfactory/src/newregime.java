public class newregime implements taxcalculation{
    @Override
    public double calculatetax(salarydetails details) {
        return 0.4*details.getBasic()*details.getHra()*details.getLta();
    }
}
