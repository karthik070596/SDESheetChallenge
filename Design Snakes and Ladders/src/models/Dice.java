package models;

import java.util.Random;

public class Dice {
    private int maxNo;

    public int getMaxNo() {
        return maxNo;
    }

    public void setMaxNo(int maxNo) {
        this.maxNo = maxNo;
    }

    public int roll()
    {
        Random random=new Random();
        int value=random.nextInt(maxNo+1);
        return value;
    }
}
