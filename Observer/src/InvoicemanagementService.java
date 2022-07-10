public class InvoicemanagementService implements Subscriber<Order>{

    InvoicemanagementService()
    {
      Flipkart.registerSubscriber(Events.ORDERPLACED,this);
      Flipkart.registerSubscriber(Events.ORDERCANCELLED,this);
    }
    @Override
    public void listen(Events events, Order details) {
        if(events==Events.ORDERPLACED)
            generateInvoice();
        else
            cancelInvoice();

    }
    public void generateInvoice()
    {
        System.out.println("Invoice has been generated");
    }
    public void cancelInvoice()
    {
        System.out.println("Invoice has been cancelled");
    }

}
