public class sparrow extends bird implements cloneable{
    private int legsize;

    public sparrow(){

    }
    public sparrow(sparrow old) {
        super(old);
        this.legsize= old.legsize;
    }
    public void setLegsize(int legsize) {
        this.legsize = legsize;
    }


    public sparrow clone()
    {
        return new sparrow(this);
    }
}
