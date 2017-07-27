package Windows;

import FieldAndComponents.Field;
import FieldAndComponents.FieldSize;
import GameEngine.Game;
import Graphics.GraphicEngine;
import Players.Player;
import Symbols.SymbolO;
import Symbols.SymbolPercent;
import Symbols.SymbolSharp;
import Symbols.SymbolX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.*;

/**
 * Created by Liuba on 25.06.2017.
 */
public class StartWindow{
    public JFrame frame = new JFrame();
    public JButton startGameButton;
    public JCheckBox player_4_CheckBox;
    public JCheckBox player_3_CheckBox;
    public JCheckBox player_2_CheckBox;
    public JCheckBox player_1_CheckBox;
    public JButton exitButton;
    public JTextField player_1_textField;
    public JTextField player_2_textField;
    public JTextField player_3_textField;
    public JTextField player_4_textField;
    public JPanel mainPanel;
    public JComboBox fieldWidthComboBox;
    public JComboBox fieldHeightComboBox;
    Game newGame;
    GraphicEngine graphicEngine;

    public StartWindow(GraphicEngine graphicEngine) {
        frame.setContentPane(mainPanel);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        newGame = new Game(new Field(new FieldSize(1)), new ArrayList<Player>());
        this.graphicEngine = graphicEngine;

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (player_1_CheckBox.isSelected())
                {
                    String playerName = player_1_textField.getText();
                    if (playerName == null) playerName = "Unknown Player";
                    newGame.setPlayer(new Player(playerName, new SymbolX()));
                }

                if (player_2_CheckBox.isSelected())
                {
                    String playerName = player_2_textField.getText();
                    if (playerName == null) playerName = "Unknown Player";
                    newGame.setPlayer(new Player(playerName, new SymbolO()));
                }

                if (player_3_CheckBox.isSelected())
                {
                    String playerName = player_3_textField.getText();
                    if (playerName == null) playerName = "Unknown Player";
                    newGame.setPlayer(new Player(playerName, new SymbolSharp()));
                }

                if (player_4_CheckBox.isSelected())
                {
                    String playerName = player_4_textField.getText();
                    if (playerName == null) playerName = "Unknown Player";
                    newGame.setPlayer(new Player(playerName, new SymbolPercent()));
                }

                newGame.setField(new Field(
                        new FieldSize(fieldHeightComboBox.getSelectedIndex() + 1,
                                fieldWidthComboBox.getSelectedIndex() + 1)));
                graphicEngine.startNewGame();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteFrame();
            }
        });
    }

    public Game getNewGame()
    {
        return newGame;
    }

    public void deleteFrame()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);
        frame.dispose();
    }
}
