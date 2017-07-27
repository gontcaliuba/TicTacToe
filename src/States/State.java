package States;

/**
 * Created by Liuba on 18.05.2017.
 */
public interface State {
    public void start();
    public void play();
    public void endGame();
    public void reactiveGame();
    public boolean canPlay();
}
