package States;

import GameEngine.Engine;
import Players.Player;

/**
 * Created by Liuba on 18.05.2017.
 */
public class StopState extends ConcreteState{
    public StopState(Engine engine)
    {
        super(engine);
    }
    public void reactive()
    {
        engine.setState(new StartState(engine));
    }
}
