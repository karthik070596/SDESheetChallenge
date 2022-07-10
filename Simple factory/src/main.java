public class main {
    public static void main(String[] args) {
        salarydetails details=new salarydetails(10,20,30);
        taxalgorithm algorithm=taxcalculate.decidetax(taxregime.NEW);
        System.out.println(algorithm.calculateTax(details));
    }
}
