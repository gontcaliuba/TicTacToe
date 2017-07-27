package Results;

/**
 * Created by Liuba on 22.06.2017.
 */
public class TieResult extends GameResult {
    public TieResult()
    {
        super(null, GameResultType.TIE);
    }
    public String getResultMessage()
    {
        return "Tie!";
    }
}
