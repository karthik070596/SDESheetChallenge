public class main {
    public static void main(String[] args) {
        Flipkart f=new Flipkart(new PayUadapter());
        f.makePayment("1234",418,25,2022);
    }
}
