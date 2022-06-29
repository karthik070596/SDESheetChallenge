
public interface PGinterface {
    Long payviaCC(String number, int cvv, int expmonth, int expyear);
    PaymentStatus checkStatus(Long transactionid);
}


