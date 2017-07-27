package States;

import GameEngine.Engine;
import Players.Player;

/**
 * Created by Liuba on 18.05.2017.
 */
public class ConcreteState implements State {
    protected Engine engine;
    public ConcreteState(Engine engine)
    {
        this.engine = engine;
    }
    public void start(){}
    public void play(){}
    public void endGame(){}
    public void reactiveGame(){}
    public boolean canPlay() { return false; }
}
