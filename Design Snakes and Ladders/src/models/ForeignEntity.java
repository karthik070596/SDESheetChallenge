package models;

import java.net.Proxy;

public abstract class ForeignEntity {
    private Type type;
    private int from;
    private int to;
    public ForeignEntity(Type type,int from,int to)
    {
        this.type=type;
        this.from=from;
        this.to=to;
    }
}
