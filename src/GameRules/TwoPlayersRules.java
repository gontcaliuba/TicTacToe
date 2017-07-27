package GameRules;

import FieldAndComponents.Field;
import Players.Player;
import Results.GameResult;
import Results.NullResult;
import Results.TieResult;
import Results.WinnerResult;

/**
 * Created by Liuba on 18.06.2017.
 */
public class TwoPlayersRules implements Rules{
    Field currentField;
    Player theWinner;

    public TwoPlayersRules(Field field) { currentField = field; }

    public Player getTheWinner(){ return theWinner;}
    public boolean canPutTheSymbol(){ return true; }
    public GameResult isItTheEnd() {
        int arrayLength = currentField.getSize().getLength();
        int arrayWidth = currentField.getSize().getWidth();

        if ((arrayLength == 1) && (arrayWidth == 1))
        {
            theWinner = currentField.getCell(0, 0).getPlayer();
            return new WinnerResult(theWinner);
        }

        if ( arrayLength == arrayWidth) {
            //главная диагональ
            if (areElementsEqual(currentField, arrayWidth, 0, 0, 1, 1) == true) {
                theWinner = currentField.getCell(0, 0).getPlayer();
                return new WinnerResult(theWinner);
            }

            //побочная диагональ
            if (areElementsEqual(currentField, arrayLength, arrayLength - 1, 0, -1, 1) == true) {
                theWinner = currentField.getCell(arrayLength - 1, 0).getPlayer();
                return new WinnerResult(theWinner);
            }
        }

        //по вертикали
        for (int i = 0; i < arrayLength; i++)
        {
            if ((areElementsEqual(currentField, arrayWidth, i, 0, 0,1) == false)) continue;
            theWinner = currentField.getCell(i, 0).getPlayer();
            return new WinnerResult(theWinner);
        }

        //по горизонтали
        for (int i = 0; i < arrayWidth; i++)
        {
            if ((areElementsEqual(currentField, arrayLength, 0, i, 1,0) == false)) continue;
            theWinner = currentField.getCell(0, i).getPlayer();
            return new WinnerResult(theWinner);
        }

        //проверка на ничью
        int count = 0;
        for (int i = 0; i < arrayLength; i++)
        {
            for (int j = 0; j < arrayWidth; j++)
            {
                if (currentField.getCell(i, j).getPlayer() != null )
                    count++;
            }
        }
        if (count == arrayLength*arrayWidth)
            return new TieResult();

        return new NullResult();
    }

    //проверка массива на равность элементов
    private boolean areElementsEqual(Field matrix, int size, int x, int y, int offsetX, int offsetY)
    {
        if (size <= 0) return false;
        if ((size == 1) && (matrix.getCell(0, 0).getPlayer() == null)) return false;
        size--;
        while(size-- > 0)
        {
            if (matrix.getCell(x, y).getPlayer() == null) return false;
            if (matrix.getCell(x + offsetX, y + offsetY).getPlayer() == null) return false;
            if (matrix.getCell(x, y).getPlayer().getSymbol()
                    != matrix.getCell(x + offsetX, y + offsetY).getPlayer().getSymbol()) return false;
            x += offsetX;
            y += offsetY;
        }
        return true;
    }

}
