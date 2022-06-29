public class Flipkart {
    private PGinterface paymentgateway;

    Flipkart(PGinterface paymentgateway)
    {
        this.paymentgateway=paymentgateway;
    }
    public void makePayment(String number,int cvv,int expmonth, int expyear)
    {
        Long transactionid=paymentgateway.payviaCC(number,cvv,expmonth,expyear);
        while(paymentgateway.checkStatus(transactionid)!=PaymentStatus.SUCCESS)
            System.out.println("Waiting for success");
        System.out.println("Payment Sucess");
    }
}
