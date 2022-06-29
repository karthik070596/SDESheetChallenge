package Razorpay;

public class Razorpay {
    public String payCC(String number,String cvv,String month,String year)
    {
        System.out.println("Payment Successful card has been debited");
        return "1";
    }
    public Boolean paymentStatus(String transactionid)
    {
        return true;
    }
}
