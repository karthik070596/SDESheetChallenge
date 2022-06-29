public class main {
    public static void main(String[] args) {
        Icecream icecream=new Chocolate(new Vanilla(new Bluecone()));
        System.out.println(icecream.getRate());
        System.out.println(icecream.getConstituents());
    }

}
