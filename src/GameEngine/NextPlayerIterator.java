package GameEngine;

import Players.Player;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Liuba on 19.05.2017.
 */
public class NextPlayerIterator {
    List<Player> players;
    ListIterator<Player> iter;
    public NextPlayerIterator(List<Player> players)
    {
        this.players = players;
        iter = this.players.listIterator();
    }

    public Player getFirstPlayer()
    {
        return players.get(0);
    }

    public Player getNextPlayer()
    {
        //переходим к следующему полю в списке, если следующего нет - в начало списка
        if (players.isEmpty()) return null;
        if (!iter.hasNext()) iter = players.listIterator();
        return iter.next();
    }
}
