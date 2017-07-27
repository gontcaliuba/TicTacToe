package Results;

import Players.Player;

/**
 * Created by Liuba on 22.06.2017.
 */
public abstract class GameResult {
    Player theWinner;
    GameResultType type;
    public GameResult(Player player, GameResultType type)
    {
        theWinner = player;
        this.type = type;
    }
    public Player getTheWinner() { return theWinner; }
    public GameResultType getResultType() { return type; }
    public String getResultMessage(){ return null; }
}
