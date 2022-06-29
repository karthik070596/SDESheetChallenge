import Razorpay.Razorpay;

public class Razorpayadapter implements PGinterface{
    private Razorpay razorpay=new Razorpay();
    @Override
    public Long payviaCC(String number, int cvv, int expmonth, int expyear) {
       String Cvv=String.valueOf(cvv);
       String month=String.valueOf(expmonth);
       String year=String.valueOf(expyear);
       String answer=razorpay.payCC(number,Cvv,month,year);
       Long id=Long.parseLong(answer);
       return id;
    }

    @Override
    public PaymentStatus checkStatus(Long transactionid) {
        String tid=String.valueOf(transactionid);
        Boolean result=razorpay.paymentStatus(tid);
        if(result==true)
            return PaymentStatus.SUCCESS;
        else
            return PaymentStatus.FAILURE;
    }
}
