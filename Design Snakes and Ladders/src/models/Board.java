package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    private int size;
    private List<HashMap<Integer,ForeignEntity>> foreignEntity;
    public Board(int size)
    {
        this.size=size;
        this.foreignEntity=new ArrayList<>();
    }



    public int getSize() {
        return size;
    }


    public List<HashMap<Integer, ForeignEntity>> getForeignEntity() {
        return foreignEntity;
    }
}
