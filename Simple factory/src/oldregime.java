public class oldregime implements taxalgorithm{

    @Override
    public double calculateTax(salarydetails details) {
        return 0.3*details.getBasic()*details.getHra();
    }
}
