package FieldAndComponents;

import Players.Player;
import Symbols.SymbolX;

import java.util.*;

/**
 * Created by Liuba on 18.05.2017.
 */
public class Field {
    List<List<Cell>> cellsArray = new ArrayList<>();
    FieldSize size;

    public Field(FieldSize size)
    {
        //заполняем пустыми ячейками
        this.size = size;
        int length = size.getLength();
        int width = size.getWidth();
        for (int i = 0; i < length; i++)
        {
            cellsArray.add(i, new ArrayList<Cell>());
            for (int j = 0; j < width; j++)
            {
                cellsArray.get(i).add(j, new Cell());
            }
        }
    }
    public void updateCell(int x, int y, Player player)
    {
        if ((x < 0)||(x >= size.getLength())) return;
        if ((y < 0)||(y >= size.getWidth())) return;
        cellsArray.get(x).get(y).setPlayer(player);
    }
    public FieldSize getSize() { return size; }
    public void setSize(FieldSize size) { this.size = size; }
    public Cell getCell(int x, int y)
    {
        if ((x < 0)||(x >= size.getLength())) return null;
        if ((y < 0)||(y >= size.getWidth())) return null;
        return cellsArray.get(x).get(y);
    }


}
