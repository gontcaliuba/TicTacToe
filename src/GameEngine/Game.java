package GameEngine;

import FieldAndComponents.Field;
import Players.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liuba on 18.05.2017.
 */
public class Game {
    Field currentField;
    List<Player> players;

    public Game(Field currentField, List<Player> players)
    {
        this.currentField = currentField;
        this.players = players;
    }

    public void setField(Field field) { currentField = field; }
    public Field getCurrentField() { return currentField; }
    public List<Player> getPlayers() { return players; }
    public void setPlayer(Player player)
    {
        if (player != null)
            players.add(player);
    }


}
