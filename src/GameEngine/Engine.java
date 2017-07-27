package GameEngine;

import Connector.ButtonConnector;
import Connector.Coordinate;
import FieldAndComponents.Field;
import GameRules.Rules;
import GameRules.TwoPlayersRules;
import Players.Player;
import Results.GameResult;
import Results.GameResultType;
import States.GameState;
import States.State;
import States.StopState;
import Symbols.Symbol;

/**
 * Created by Liuba on 18.05.2017.
 */
public class Engine {
    State state;
    Rules rules;
    Player currentPlayer;
    Game game;
    NextPlayerIterator iterator;
    ButtonConnector buttonConnector;

    public Engine() {}

    public Engine(Rules gameRules, Game game, NextPlayerIterator iterator)
    {
        state = new GameState(this);
        rules = gameRules;
        this.game = game;
        this.iterator = iterator;
        currentPlayer = iterator.getNextPlayer();
    }
    public void doNewTurn(ButtonConnector buttonConnector, Coordinate buttonCoordinate)
    {
        this.buttonConnector = buttonConnector;
        if (state.canPlay() == false) return;
        if (rules.canPutTheSymbol() == false) return;
        Field field = game.currentField;
        int x = buttonCoordinate.getX();
        int y = buttonCoordinate.getY();

        //проверка, если можно поставить символ
        if (field.getCell(x, y).getPlayer() != null) return;
        field.updateCell(x, y, currentPlayer);
        buttonConnector.setSymbolOnButton(currentPlayer.getSymbol());
        nextPlayer();

        //проверка на конец игры
        GameResult result = rules.isItTheEnd();
        if (result.getResultType() != GameResultType.NULL)
        {
            endGame();
            buttonConnector.showMessage(result.getResultMessage());
        }
    }
    public void setState(State state)
    {
        this.state = state;
    }
    public void nextPlayer()
    {
        currentPlayer = iterator.getNextPlayer();
    }

    public void start(Game newGame)
    {
        game = newGame;
        rules = new TwoPlayersRules(newGame.getCurrentField());
        iterator = new NextPlayerIterator(game.getPlayers());
        currentPlayer = iterator.getNextPlayer();
        state = new GameState(this);
    }
    public void play(){}
    public void endGame()
    {
        state = new StopState(this);
    }
    public void reactiveGame(){}

}
