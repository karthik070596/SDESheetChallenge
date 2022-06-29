public class salarydetails {
    private int basic;
    private int hra;
    private int lta;
    public salarydetails(int basic,int hra,int lta)
    {
        this.basic=basic;
        this.hra=hra;
        this.lta=lta;
    }
    public int getBasic() {
        return basic;
    }

    public int getHra() {
        return hra;
    }

    public int getLta() {
        return lta;
    }
}
