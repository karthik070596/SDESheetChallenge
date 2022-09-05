package models;

public class EntryGate extends Gate {
    private DisplayBoard displayBoard;


    public EntryGate(GateStatus status, Operator operator, int number)
    {
        super(status,operator,number);
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }
}
