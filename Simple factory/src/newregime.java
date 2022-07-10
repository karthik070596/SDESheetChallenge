public class newregime implements taxalgorithm{
    @Override
    public double calculateTax(salarydetails details) {
        return 0.4*details.getBasic()*details.getHra()*details.getLta();
    }
}
