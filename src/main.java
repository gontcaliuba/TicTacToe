import FieldAndComponents.Field;
import FieldAndComponents.FieldSize;
import GameEngine.Engine;
import GameEngine.Game;
import GameEngine.NextPlayerIterator;
import GameRules.TwoPlayersRules;
import Graphics.ButtonGenerator;
import Players.Player;
import Symbols.SymbolO;
import Symbols.SymbolX;
import Menu.SimpleMenuEx;
import Graphics.GraphicEngine;
import Windows.StartWindow;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Liuba on 18.05.2017.
 */
public class main {
    public static void main(String[] args) {
        /*List<Player> players = new ArrayList<Player>();
        players.add(0, new Player("Vasea", new SymbolX()));
        players.add(1, new Player("Kolea", new SymbolO()));

        NextPlayerIterator iter = new NextPlayerIterator(players);

        for(int i = 0; i < 7; i++)
        {
            System.out.println(iter.getNextPlayer().getName());
        }
        MyButton button = new MyButton(new ButtonConnector());
        button.setPreferredSize(new Dimension(150, 150));
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBackground(Color.yellow);
        frame.setVisible(true);*/


        /*MyButton newButton = new MyButton(new ButtonConnector());
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(newButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        */



        /*
        Field field = new Field(new FieldSize(2, 3));
        for (int i = 0; i < field.getSize().getLength(); i++) {
            for (int j = 0; j < field.getSize().getWidth(); j++) {
                field.updateCell(i, j, new Player("Vasea", new SymbolO()));
            }

        }

        for (int i = 0; i < field.getSize().getLength(); i++) {
            for (int j = 0; j < field.getSize().getWidth(); j++) {
                System.out.println(field.getCell(i, j).getPlayer().getName());
            }
        }
        */

        /*
        Field field = new Field(new FieldSize(3, 3));
        List<Player> players = new ArrayList<Player>();
        players.add(0, new Player("Liuba", new SymbolX()));
        players.add(1, new Player("Dima", new SymbolO()));
        Game game = new Game(field, players);
        NextPlayerIterator iterator = new NextPlayerIterator(players);
        GraphicEngine graphicEngine = new GraphicEngine(field, new Engine(new TwoPlayersRules(field), game, iterator));
        //graphicEngine.paintGraphic();

       */

        GraphicEngine grEng = new GraphicEngine(new Engine());

    }

}
