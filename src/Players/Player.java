package Players;

import Symbols.Symbol;

/**
 * Created by Liuba on 18.05.2017.
 */
public class Player {
    String name;
    Symbol symbol;

    public Player(String name, Symbol symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName()
    {
        return name;
    }

    public Symbol getSymbol() { return symbol; }
}
