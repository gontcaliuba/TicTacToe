package Results;

import Players.Player;
import States.GameState;

/**
 * Created by Liuba on 22.06.2017.
 */
public class NullResult extends GameResult {
    public NullResult()
    {
        super(null, GameResultType.NULL);
    }
}
