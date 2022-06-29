public class main {
    public static void main(String[] args) {
        taxregime regime=taxregime.NEW;
        salarydetails details=new salarydetails(10,20,50);
        System.out.println(taxcalculator.calculatetax(regime,details));

    }
}
