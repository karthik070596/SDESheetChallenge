package models;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public boolean isEmpty()
    {
        return (symbol==null);
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public void clearCell()
    {
        this.symbol=null;
    }
}
