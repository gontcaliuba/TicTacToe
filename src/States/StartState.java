package States;

import GameEngine.Engine;

/**
 * Created by Liuba on 18.05.2017.
 */
public class StartState extends ConcreteState{
    public StartState(Engine engine)
    {
        super(engine);
    }
    public void start()
    {
        engine.setState(new StartState(engine));
    }
}
