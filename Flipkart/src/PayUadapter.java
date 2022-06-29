import PayU.PayU;
import PayU.Status;

public class PayUadapter implements PGinterface
{
    private PayU payu=new PayU();
    @Override
    public Long payviaCC(String number, int cvv, int expmonth, int expyear) {
        Long Number=Long.parseLong(number);
        Long Cvv=Long.valueOf(cvv);
        Long Month=Long.valueOf(expmonth);
        Long Year=Long.valueOf(expyear);
        String answer=payu.PayviaCC(Number,Cvv,Month,Year);
        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus checkStatus(Long transactionid) {
        String id = String.valueOf(transactionid);
        if (payu.checkPaymentStatus(id) == Status.SUCCESS)
            return PaymentStatus.SUCCESS;
        else
            return PaymentStatus.FAILURE;
    }
}
