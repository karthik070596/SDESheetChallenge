import java.util.Locale;

public class GelPen extends Pen implements RefilPen{
    private boolean canrefil;
    private Refil refil;
    private GelPen()
    {
        super(Type.Gel,new Smoothwritebehavior());
    }
    public static class Builder
    {
        private boolean canrefil=false;
        private Refil refil;
        public Builder setRefil(Refil refil)
        {
            this.refil=refil;
            return this;
        }
        public Builder canRefil(boolean value)
        {
            this.canrefil=true;
            return this;
        }
        public GelPen build()
        {
            GelPen gelPen=new GelPen();
            gelPen.canrefil=this.canrefil;
            gelPen.refil=this.refil;
            return gelPen;
        }
    }
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public void setRefil(Refil refil) {

    }

    @Override
    public boolean canRefil() {
        return this.canrefil;
    }


}
