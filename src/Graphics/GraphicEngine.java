package Graphics;

import Connector.ButtonConnector;
import Connector.Coordinate;
import FieldAndComponents.Field;
import FieldAndComponents.FieldSize;
import GameEngine.Engine;
import GameEngine.Game;
import GameEngine.NextPlayerIterator;
import GameRules.TwoPlayersRules;
import Players.Player;
import Symbols.SymbolO;
import Symbols.SymbolX;
import Windows.StartWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by Liuba on 23.06.2017.
 */
public class GraphicEngine extends JFrame{
    Field currentField;
    Engine currentEngine;
    Menu menu;
    ButtonGenerator buttonGenerator;
    GraphicField graphicField;
    StartWindow startWindow;

    public GraphicEngine(Engine engine)
    {
        currentEngine = engine;
        showNewGameSettings();
    }

    private void paintGraphic()
    {
        addMenu();
        buttonGenerator = new ButtonGenerator(currentField, currentEngine);
        graphicField = buttonGenerator.setButtonsOnField();
        getContentPane().add(graphicField.getPanel());
        setDefaultCloseOperation(3);
        Dimension dimension = new Dimension((int)graphicField.getDimention().getWidth(),
                (int)(graphicField.getDimention().getHeight()));
        getContentPane().setPreferredSize(dimension);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void addMenu()
    {
        List<String> menuList = new ArrayList<>();
        menuList.add(0, "File");
        menuList.add(1, "New Game");
        menu = new Menu(this);
        menu.createMenuBar();
    }
    public void showNewGameSettings()
    {
        this.setVisible(false);
        showStartWindow();
    }

    private void showStartWindow()
    {
        startWindow = new StartWindow(this);
    }

    public void startNewGame()
    {
        Game newGame = startWindow.getNewGame();
        startWindow.deleteFrame();
        currentEngine.start(newGame);
        currentField = newGame.getCurrentField();
        this.paintGraphic();
    }


}
