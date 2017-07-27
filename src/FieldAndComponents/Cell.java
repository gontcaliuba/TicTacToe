package FieldAndComponents;

import Players.Player;

/**
 * Created by Liuba on 18.05.2017.
 */
public class Cell {
    Player player;

    public Cell(){ player = null; }
    public Cell(Player player)
    {
        this.player = player;
    }
    public Player getPlayer()
    {
        return player;
    }
    public void setPlayer(Player player) { this.player = player; }
}
