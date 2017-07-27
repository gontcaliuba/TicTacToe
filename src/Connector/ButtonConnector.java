package Connector;

import GameEngine.Engine;
import Messages.ButtonMessage;
import Symbols.Symbol;
import Graphics.MyButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Liuba on 18.05.2017.
 */
public class ButtonConnector implements Connector {
    Engine engine;
    Coordinate buttonCoordinate;
    MyButton button;

    public ButtonConnector(MyButton button, Coordinate buttonCoordinate, Engine engine)
    {
        this.button = button;
        this.buttonCoordinate = buttonCoordinate;
        this.engine = engine;
    }
    public Engine getEngine() { return engine; }
    public MyButton getButton() { return button; }
    public Coordinate getButtonCoordinate() { return buttonCoordinate; }
    public void handleClick()
    {
        engine.doNewTurn(this, buttonCoordinate);
    }
    public void setSymbolOnButton(Symbol symbol)
    {
        button.setForeground(symbol.getColour());
        String symbolToDisplay = symbol.getSymbol();
        button.setText(symbolToDisplay);
        button.repaint();
    }
    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(null,message,"",JOptionPane.WARNING_MESSAGE);
    }

    public void displayInfo(){}


}
