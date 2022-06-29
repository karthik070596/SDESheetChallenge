public class main {
    public static void main(String[] args) {
        salarydetails details=new salarydetails(10,20,50);
        taxation t=new createnewregime();
        taxcalculation calculate=t.regimeselection();
        System.out.println(calculate.calculatetax(details));
    }
}
