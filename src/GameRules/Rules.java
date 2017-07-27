package GameRules;

import Players.Player;
import Results.GameResult;

/**
 * Created by Liuba on 18.05.2017.
 */
public interface Rules {
    public Player getTheWinner();
    public GameResult isItTheEnd();
    public boolean canPutTheSymbol();
}
