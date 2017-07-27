package States;

import GameEngine.Engine;

/**
 * Created by Liuba on 18.05.2017.
 */
public class GameState extends ConcreteState {
    public GameState(Engine engine)
    {
        super(engine);
    }
    public void play()
    {
        engine.nextPlayer();
    }
    public void endGame() { engine.setState(new StopState(engine)); }
    public boolean canPlay() { return true; }
}
