package PayU;

public class PayU {
    public String PayviaCC(Long number,Long cvv,Long month,Long year)
    {
        System.out.println("Payment processed via PayU and the amount has been debited from the card");
        return "1";
    }
    public Status checkPaymentStatus(String transactionid)
    {
        return Status.SUCCESS;
    }


}
