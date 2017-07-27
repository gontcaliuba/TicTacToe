package Results;

import Players.Player;

/**
 * Created by Liuba on 22.06.2017.
 */
public class WinnerResult extends GameResult {
    public WinnerResult(Player player)
    {
        super(player, GameResultType.WIN);
    }
    public String getResultMessage()
    {
        return "The end! The winner is " + getTheWinner().getName() + ".";
    }
}
