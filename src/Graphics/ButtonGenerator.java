package Graphics;

import Connector.ButtonConnector;
import Connector.Coordinate;
import FieldAndComponents.Field;
import GameEngine.Engine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by Liuba on 06.06.2017.
 */
public class ButtonGenerator{
    Field currentField;
    Engine currentEngine;

    public ButtonGenerator(Field field, Engine engine) {
        currentField = field;
        currentEngine = engine;
    }

    public GraphicField setButtonsOnField(){
        int fieldLength = currentField.getSize().getLength();
        int fieldWidth = currentField.getSize().getWidth();
        int buttonHeight = 0;
        int buttonWidth = 0;

        JPanel p = new JPanel();
        p.setLayout(null);
        for(int i = 0; i < fieldLength; i++)
        {
            for (int j = 0; j < fieldWidth; j++)
            {
                MyButton newButton = new MyButton(new Dimension(100, 100));
                ButtonConnector connector = new ButtonConnector(newButton, new Coordinate(i, j), currentEngine);
                newButton.setButtonConnector(connector);
                buttonHeight = ((int)(newButton.getButtonDimension().getHeight()));
                buttonWidth = (int)newButton.getButtonDimension().getHeight();
                newButton.setBounds((j*buttonHeight), (i*buttonWidth), buttonHeight, buttonWidth);
                p.add(newButton);
            }
        }
        return new GraphicField(p, new Dimension(buttonWidth*fieldWidth, buttonHeight*fieldLength));
    }

}
