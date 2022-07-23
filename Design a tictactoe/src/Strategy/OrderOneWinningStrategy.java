package Strategy;

import models.Board;
import models.Cell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{

    List<HashMap<Character,Integer>>rowCharCounts;
    List<HashMap<Character,Integer>>colCharCounts;
    private void initializeCounts(Board board)
    {
        rowCharCounts=new ArrayList<>();
        colCharCounts=new ArrayList<>();
        for(int i=0;i< board.getDimension();i++)
        {
            rowCharCounts.add(new HashMap<>());
            colCharCounts.add(new HashMap<>());
        }
    }
    @Override
    public boolean checkStrategy(Board board, int lastIndex, Cell cell) {
        if(rowCharCounts==null)
            initializeCounts(board);

        int row=cell.getRow();
        int col=cell.getCol();
        if(!rowCharCounts.get(row).containsKey(cell.getSymbol().getCharacter()))
            rowCharCounts.get(row).put(cell.getSymbol().getCharacter(),0);
        if(!colCharCounts.get(col).containsKey(cell.getSymbol().getCharacter()))
            colCharCounts.get(col).put(cell.getSymbol().getCharacter(),0);
        rowCharCounts.get(row).put(
                cell.getSymbol().getCharacter(),
                1 + rowCharCounts.get(row).get(cell.getSymbol().getCharacter())
        );

        colCharCounts.get(col).put(
                cell.getSymbol().getCharacter(),
                1 + colCharCounts.get(col).get(cell.getSymbol().getCharacter())
        );

        if(rowCharCounts.get(row).get(cell.getSymbol().getCharacter()).equals(board.getDimension()))
            return true;
        if(colCharCounts.get(col).get(cell.getSymbol().getCharacter()).equals(board.getDimension()))
            return true;
        return false;
    }
}
