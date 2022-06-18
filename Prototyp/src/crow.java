public class crow extends bird implements cloneable{
    private String sound;
    public crow(){}
    public crow(crow old)
    {
        super(old);
        this.sound=old.sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public crow clone() {
        return new crow(this);
    }
}
