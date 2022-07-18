public abstract class Pen {
    private String name;
    private Integer price;
    private Type type;
    private Writebehavior writebehavior;
    Pen(Type type,Writebehavior writebehavior)
    {
        this.type=type;
        this.writebehavior=writebehavior;
    }
    public void write()
    {
        this.writebehavior.write();
    }
    public abstract Color getColor();
}
